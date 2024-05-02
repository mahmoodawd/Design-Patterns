package dev.awd.chainofresponsibility.excercise;

public class FormattingChecksHandler extends AbstractDataProcessingChainHandler {
    @Override
    public DataResponse handle(Data data) {
        System.out.println("Formatting checks....");
        if (!data.isHasPassedFormattingChecks()) {
            return new DataResponse("Failed to Pass Formatting Checks", false);
        }
        return super.handle(data);
    }
}
