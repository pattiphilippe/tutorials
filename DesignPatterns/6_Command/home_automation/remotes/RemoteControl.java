package home_automation.remotes;

import home_automation.commands.Command;
import home_automation.commands.NoCommand;

public class RemoteControl {
    private static final int NB_COMMANDS = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[NB_COMMANDS];
        offCommands = new Command[NB_COMMANDS];

        Command noCommand = new NoCommand();
        for(int i = 0; i < NB_COMMANDS; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        checkSlot(slot);
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        checkSlot(slot);
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        checkSlot(slot);
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    private void checkSlot(int slot){
        if(slot < 0 || NB_COMMANDS < slot){
            throw new IllegalArgumentException("Slot is out of bounds! [0;" + (NB_COMMANDS-1) + "]" );
        }
    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n----- Remote Control ----- \n");
        for(int i = 0; i < NB_COMMANDS; i++){
            stringBuff.append("[slot" + i + "]" + onCommands[i].getClass().getName() 
            + "\t" + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("undo command " + undoCommand.getClass().getName());
        return stringBuff.toString();
    }
}