package dev.awd.behavioral.chainofresponsibility.excercise;

public class DataSizeHandler extends AbstractDataProcessingChainHandler {
    @Override
    public DataResponse handle(Data data) {
        System.out.println("Data Size checks....");
        if (!data.isHasPassedDataSizeChecks()) {
            return new DataResponse("Failed to Pass Data Size Checks", false);
        }
        return super.handle(data);
    }
}
