package home_automation.commands;

import home_automation.receivers.CeilingFan;
import home_automation.receivers.CeilingFanSpeed;

public class CeilingFanHighCommand extends CeilingFanBaseCommand{

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.setSpeed(CeilingFanSpeed.HIGH);
    }
    
}
