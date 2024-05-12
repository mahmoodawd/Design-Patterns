package dev.awd.mediator.excercise;

public class CommercialAirplane implements Airplane {
    private TrafficController controller;

    public CommercialAirplane(TrafficController controller) {
        this.controller = controller;
    }

    @Override
    public String getType() {
        return "Commercial";
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
        System.out.println("Commercial Airplane: " + message);
    }
}
