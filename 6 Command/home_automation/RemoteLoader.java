package home_automation;

import home_automation.commands.GarageDoorDownCommand;
import home_automation.commands.GarageDoorUpCommand;
import home_automation.commands.LightOffCommand;
import home_automation.commands.LightOnCommand;
import home_automation.commands.StereoOffCommand;
import home_automation.commands.StereoOnWithCdCommand;
import home_automation.receivers.GarageDoor;
import home_automation.receivers.Light;
import home_automation.receivers.Stereo;
import home_automation.remotes.RemoteControl;

public class RemoteLoader {
    public static void main(String [] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage Door");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);

        System.out.println(remoteControl);

        for(int i = 0; i < 4; i++){
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
        
    }
}
