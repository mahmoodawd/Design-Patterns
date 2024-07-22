package dev.awd.behavioral.chainofresponsibility.excercise;

public interface DataProcessingChainHandler {
    DataProcessingChainHandler setNext(DataProcessingChainHandler next);
    DataResponse handle(Data data);
}
