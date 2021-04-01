package home_automation.commands;

import home_automation.receivers.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
