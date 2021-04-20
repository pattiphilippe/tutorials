package home_automation.commands;

import home_automation.receivers.CeilingFan;
import home_automation.receivers.CeilingFanSpeed;

public class CeilingFanLowCommand extends CeilingFanBaseCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.setSpeed(CeilingFanSpeed.LOW);
    }
    
}
