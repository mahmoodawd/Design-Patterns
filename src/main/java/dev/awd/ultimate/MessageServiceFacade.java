package dev.awd.ultimate;

public class MessageServiceFacade {

    private static final Logger logger = Logger.getLogger();
    private static final String TAG = MessageServiceFacade.class.getName();
    CachingProxy messageCachingProxy;
    MessageRepository messageRepository;
    MessageAnalysisService analysisService;

    public MessageServiceFacade(CachingProxy messageCachingProxy, MessageRepository messageRepository, MessageAnalysisService analysisService) {
        this.messageCachingProxy = messageCachingProxy;
        this.messageRepository = messageRepository;
        this.analysisService = analysisService;
    }

    public String handle(String message) {
        logger.info(TAG, "Start Unformatted Message Analysis");
        analysisService.analyzeUnFormattedMessage(message);
        logger.info(TAG, "Start formatted Message Analysis");
        MessageFormatter messageFormatter = MessageFormatterFactory
                .getMessageFormatter(message);
        String formattedMessage = messageFormatter
                .formatMessage(message);
        analysisService.analyzeFormattedMessage(formattedMessage);
        logger.info(TAG, "Saving Message to DB");
        messageRepository.saveMessage(formattedMessage);
        logger.info(TAG, "Processing Message");
        return messageCachingProxy.handleMessage(formattedMessage);
    }
}
