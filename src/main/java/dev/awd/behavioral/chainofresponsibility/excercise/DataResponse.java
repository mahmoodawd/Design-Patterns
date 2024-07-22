package dev.awd.behavioral.chainofresponsibility.excercise;

public class DataResponse {
    private String result;
    private boolean success;

    public DataResponse(String result, boolean success) {
        this.result = result;
        this.success = success;
    }

    public String getResult() {
        return result;
    }

    public boolean isSuccess() {
        return success;
    }
}
