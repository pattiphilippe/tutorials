package home_automation.commands;

import home_automation.receivers.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
