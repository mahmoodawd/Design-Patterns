package dev.awd.behavioral.mediator.excercise;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements TrafficController {
    private List<Airplane> airplanes;

    public AirTrafficController() {
        this.airplanes = new ArrayList<>();
    }

    @Override
    public void requestTakeoff(Airplane airplane) {
        airplanes.stream().filter(currentAirplane -> !currentAirplane.getType().equalsIgnoreCase(airplane.getType())).forEach(otherAirplanes -> otherAirplanes.notifyAirTrafficController("Airplane " + airplane.getType() + " is taking off"));
        airplane.notifyAirTrafficController("Taking off Accepted");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplanes.stream().filter(currentAirplane -> !currentAirplane.getType().equalsIgnoreCase(airplane.getType())).forEach(otherAirplanes -> otherAirplanes.notifyAirTrafficController("Airplane " + airplane.getType() + " is Landing"));

        airplane.notifyAirTrafficController("Landing Accepted");
    }

    @Override
    public void register(Airplane airplane) {
        airplanes.add(airplane);
    }
}
