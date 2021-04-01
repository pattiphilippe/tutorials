package home_automation.commands;

import home_automation.receivers.Stereo;

public class StereoOnWithCdCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
    
}
