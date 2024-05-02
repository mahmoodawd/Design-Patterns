package dev.awd.chainofresponsibility.excercise;

public class Data {
    private boolean hasPassedValidationChecks;
    private boolean hasPassedFormattingChecks;
    private boolean hasPassedDataSizeChecks;
    private boolean hasPassedPersonalInformationChecks;


    public Data(boolean hasPassedValidationChecks, boolean hasPassedFormattingChecks, boolean hasPassedDataSizeChecks, boolean hasPassedPersonalInformationChecks) {
        this.hasPassedValidationChecks = hasPassedValidationChecks;
        this.hasPassedFormattingChecks = hasPassedFormattingChecks;
        this.hasPassedDataSizeChecks = hasPassedDataSizeChecks;
        this.hasPassedPersonalInformationChecks = hasPassedPersonalInformationChecks;
    }

    public boolean isHasPassedValidationChecks() {
        return hasPassedValidationChecks;
    }

    public boolean isHasPassedFormattingChecks() {
        return hasPassedFormattingChecks;
    }

    public boolean isHasPassedDataSizeChecks() {
        return hasPassedDataSizeChecks;
    }

    public boolean isHasPassedPersonalInformationChecks() {
        return hasPassedPersonalInformationChecks;
    }
}
