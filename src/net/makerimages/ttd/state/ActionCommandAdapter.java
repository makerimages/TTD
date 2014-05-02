package net.makerimages.ttd.state;

import org.newdawn.slick.command.Command;
import org.newdawn.slick.command.InputProviderListener;

public class ActionCommandAdapter implements InputProviderListener {
    @Override
    public void controlPressed(Command command) {
        if (command instanceof ActionCommand) {
            ActionCommand actionCommand = (ActionCommand)command;
            actionCommand.execute(false);
        }
    }

    @Override
    public void controlReleased(Command command) {
        if (command instanceof ActionCommand) {
            ActionCommand actionCommand = (ActionCommand)command;
            actionCommand.execute(true);
        }
    }
}
