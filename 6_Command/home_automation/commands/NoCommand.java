package home_automation.commands;

public class NoCommand implements Command{

    @Override
    public void execute() {
        //nothing
    }

    @Override
    public void undo() {
        //nothing
    }

}
