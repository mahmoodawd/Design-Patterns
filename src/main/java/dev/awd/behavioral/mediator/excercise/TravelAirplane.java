package dev.awd.behavioral.mediator.excercise;

public class TravelAirplane implements Airplane {
    private TrafficController controller;

    public TravelAirplane(TrafficController controller) {
        this.controller = controller;
    }

    @Override
    public String getType() {
        return "Travel";
    }

    @Override
    public void requestTakeoff() {
        controller.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        controller.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficController(String message) {
        System.out.println("Travel Airplane: " + message);
    }
}
