package dev.awd;

import dev.awd.command.*;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Door frontDoor = new Door("Front Door");
        Tv tv = new Tv("TV");
        SmartHomeVoiceAssistant smartHomeVoiceAssistant = new SmartHomeVoiceAssistant();
        SmartHomeMobileApplication smartHomeApplication = new SmartHomeMobileApplication();

        smartHomeApplication.executeCommand(new TurnOnLightCommand(livingRoomLight));
        smartHomeApplication.executeCommand(new TurnOnTvCommand(tv));
        smartHomeApplication.executeCommand(new UnLockDoorCommand(frontDoor));

        smartHomeVoiceAssistant.setCommand("turn_lights_off", new TurnOffLightCommand(livingRoomLight));
        smartHomeVoiceAssistant.setCommand("switch_on_tv", new  TurnOnTvCommand(tv));
        smartHomeVoiceAssistant.setCommand("unlock_door", new UnLockDoorCommand(frontDoor));

        smartHomeVoiceAssistant.say("turn_lights_off");
        smartHomeVoiceAssistant.say("switch_on_tv");
        smartHomeVoiceAssistant.say("unlock_door");


    }
}