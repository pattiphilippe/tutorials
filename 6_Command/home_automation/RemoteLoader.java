package home_automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import home_automation.commands.CeilingFanHighCommand;
import home_automation.commands.CeilingFanMediumCommand;
import home_automation.commands.CeilingFanOffCommand;
import home_automation.commands.Command;
import home_automation.commands.GarageDoorDownCommand;
import home_automation.commands.GarageDoorUpCommand;
import home_automation.commands.LightOffCommand;
import home_automation.commands.LightOnCommand;
import home_automation.commands.MacroCommand;
import home_automation.commands.StereoOffCommand;
import home_automation.commands.StereoOnWithCdCommand;
import home_automation.receivers.CeilingFan;
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
        /*
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);

        System.out.println(remoteControl);

        for(int i = 0; i < 4; i++){
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        */
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        /*
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        */

        MacroCommand partyOn = new MacroCommand(Arrays.asList(livingRoomLightOn, stereoOnWithCd, ceilingFanMedium));
        MacroCommand partyOff = new MacroCommand(Arrays.asList(livingRoomLightOff, stereoOff, ceilingFanOff));

        remoteControl.setCommand(0, partyOn, partyOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        
        
    }
}
