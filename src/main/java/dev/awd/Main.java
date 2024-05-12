package dev.awd;

import dev.awd.mediator.excercise.*;

public class Main {
    public static void main(String[] args) {
        TrafficController controller = new AirTrafficController();

        Airplane commercialAirplane = new CommercialAirplane(controller);
        Airplane TravelAirplane = new TravelAirplane(controller);

        controller.register(commercialAirplane);
        controller.register(TravelAirplane);

        commercialAirplane.requestTakeoff();
        TravelAirplane.requestLanding();


    }
}