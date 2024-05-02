package dev.awd;

import dev.awd.chainofresponsibility.excercise.*;

public class Main {
    public static void main(String[] args) {
        DataProcessingChainHandler validationCheck = new ValidationChecksHandler();
        DataProcessingChainHandler formattingCheck = new FormattingChecksHandler();
        DataProcessingChainHandler dataSizeCheck = new DataSizeHandler();
        DataProcessingChainHandler personalInfoCheck = new PersonalInfoHandler();

        validationCheck.setNext(formattingCheck).setNext(dataSizeCheck).setNext(personalInfoCheck);

        Data data = new Data(true, true, true, false);
        DataProcessor processor = new DataProcessor(validationCheck);
        DataResponse response = processor.processData(data);
        System.out.println(response.isSuccess() + ": " + response.getResult());
    }
}