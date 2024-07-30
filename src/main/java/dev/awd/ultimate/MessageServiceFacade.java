package dev.awd.ultimate;

public class MessageServiceFacade {

    ThirdPartyMessageHandlerAPI api;
    MessageRepository messageRepository;
    MessageAnalysisService analysisService;
    MessageFormatter formatter;

    public MessageServiceFacade(ThirdPartyMessageHandlerAPI api, MessageRepository messageRepository, MessageAnalysisService analysisService, MessageFormatter formatter) {
        this.api = api;
        this.messageRepository = messageRepository;
        this.analysisService = analysisService;
        this.formatter = formatter;
    }

    public String handle(String message) {
        analysisService.analyzeFormattedMessage(message);
        String formattedMessage = formatter.format(message);
        analysisService.analyzeUnFormattedMessage(formattedMessage);
        messageRepository.saveMessage(formattedMessage);
        return api.processMessage(formattedMessage);
    }
}
