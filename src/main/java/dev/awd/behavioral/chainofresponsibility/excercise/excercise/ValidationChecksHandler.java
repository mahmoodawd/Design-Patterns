package dev.awd.behavioral.chainofresponsibility.excercise.excercise;

public class ValidationChecksHandler extends AbstractDataProcessingChainHandler {
    @Override
    public DataResponse handle(Data data) {
        System.out.println("Validation checks....");
        if (!data.isHasPassedValidationChecks()) {
            return new DataResponse("Failed to Pass Validation Checks", false);
        }
        return super.handle(data);
    }
}
