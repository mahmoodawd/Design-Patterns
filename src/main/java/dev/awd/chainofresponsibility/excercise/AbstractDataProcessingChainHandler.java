package dev.awd.chainofresponsibility.excercise;

public class AbstractDataProcessingChainHandler implements DataProcessingChainHandler {
    DataProcessingChainHandler nextHandler;

    @Override
    public DataProcessingChainHandler setNext(DataProcessingChainHandler next) {
        nextHandler = next;
        return next;
    }

    @Override
    public DataResponse handle(Data data) {
        if (nextHandler != null) {
            return nextHandler.handle(data);
        }
        return new DataResponse("Passed", true);
    }
}
