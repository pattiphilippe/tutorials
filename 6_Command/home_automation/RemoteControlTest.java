package home_automation;

import home_automation.commands.GarageDoorUpCommand;
import home_automation.commands.LightOnCommand;
import home_automation.receivers.GarageDoor;
import home_automation.receivers.Light;
import home_automation.remotes.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
