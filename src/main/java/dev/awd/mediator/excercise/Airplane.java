package dev.awd.mediator.excercise;

public interface Airplane {

    String getType();

    void requestTakeoff();

    void requestLanding();

    void notifyAirTrafficController(String message);
}
