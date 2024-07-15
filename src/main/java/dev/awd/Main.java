package dev.awd;


import dev.awd.structural.bridge.SDVideoQuality;
import dev.awd.structural.bridge.TwitchVideoProvider;
import dev.awd.structural.bridge.VideoProvider;
import dev.awd.structural.bridge.exercise.*;

public class Main {
    public static void main(String[] args) {
        AirlineProvider turkishAirlines = new TurkishAirlines(new PremiumLoyaltyProgram());
        AirlineProvider egyptAir = new EgyptAir(new BasicLoyaltyProgram());

        turkishAirlines.bookFlight();
        egyptAir.bookFlight();
        VideoProvider twitchVideoProvider = new TwitchVideoProvider(new SDVideoQuality());


    }
}