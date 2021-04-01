package home_automation.commands;

import home_automation.receivers.CeilingFan;
import home_automation.receivers.CeilingFanSpeed;

public abstract class CeilingFanBaseCommand implements Command {

    protected CeilingFan ceilingFan;
    protected CeilingFanSpeed prevSpeed;

    public CeilingFanBaseCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void undo(){
        ceilingFan.setSpeed(prevSpeed);
    }
}
