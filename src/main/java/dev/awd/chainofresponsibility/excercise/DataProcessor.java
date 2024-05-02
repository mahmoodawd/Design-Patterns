package dev.awd.chainofresponsibility.excercise;

public class DataProcessor {
    DataProcessingChainHandler handler;

    public DataProcessor(DataProcessingChainHandler handler) {
        this.handler = handler;
    }

    public DataResponse processData(Data data) {
        return handler.handle(data);
    }
}
