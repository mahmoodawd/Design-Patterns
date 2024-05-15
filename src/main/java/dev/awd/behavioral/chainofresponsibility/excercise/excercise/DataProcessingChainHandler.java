package dev.awd.behavioral.chainofresponsibility.excercise.excercise;

public interface DataProcessingChainHandler {
    DataProcessingChainHandler setNext(DataProcessingChainHandler next);
    DataResponse handle(Data data);
}
