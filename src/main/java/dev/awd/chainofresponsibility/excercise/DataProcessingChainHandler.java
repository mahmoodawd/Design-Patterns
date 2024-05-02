package dev.awd.chainofresponsibility.excercise;

public interface DataProcessingChainHandler {
    DataProcessingChainHandler setNext(DataProcessingChainHandler next);
    DataResponse handle(Data data);
}
