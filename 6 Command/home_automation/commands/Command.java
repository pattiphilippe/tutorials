package home_automation.commands;

public interface Command{
    public void execute();
    public void undo();
}