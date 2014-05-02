package net.makerimages.ttd.state;

import org.newdawn.slick.command.Command;

public interface ActionCommand extends Command {
    void execute(boolean release);
}
