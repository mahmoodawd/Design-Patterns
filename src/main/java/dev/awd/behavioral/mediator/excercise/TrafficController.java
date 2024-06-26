package dev.awd.behavioral.mediator.excercise;

public interface TrafficController {

    void requestTakeoff(Airplane airplane);

    void requestLanding(Airplane airplane);

    void register(Airplane airplane);
}
