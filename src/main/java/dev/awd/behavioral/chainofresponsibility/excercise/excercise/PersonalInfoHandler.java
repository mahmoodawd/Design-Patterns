package dev.awd.behavioral.chainofresponsibility.excercise.excercise;

public class PersonalInfoHandler extends AbstractDataProcessingChainHandler {
    @Override
    public DataResponse handle(Data data) {
        System.out.println("Personal Info checks....");
        if (!data.isHasPassedPersonalInformationChecks()) {
            return new DataResponse("Failed to Pass Personal Info Checks", false);
        }
        return super.handle(data);
    }
}
