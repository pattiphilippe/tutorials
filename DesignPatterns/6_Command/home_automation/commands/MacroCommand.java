package home_automation.commands;

import java.util.List;

public class MacroCommand implements Command {
    private List<Command> commands;

    public MacroCommand(List<Command> commands){
       this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("Macro : execute()");
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        System.out.println("Macro : undo()");
        commands.forEach(Command::undo);
    }
    
}
