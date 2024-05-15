package dev.awd.behavioral.mediator.excercise;

public interface Airplane {

    String getType();

    void requestTakeoff();

    void requestLanding();

    void notifyAirTrafficController(String message);
}
