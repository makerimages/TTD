package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.Command;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.InputProviderListener;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class SinglePlayerMenuState extends BasicGameState implements InputProviderListener {

    private final int id;
    private InputProvider provider;

    public SinglePlayerMenuState(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void init(final GameContainer gameContainer, final StateBasedGame stateBasedGame) throws SlickException {
        provider = new InputProvider(gameContainer.getInput());
        provider.addListener(this);

        provider.bindCommand(new KeyControl(Input.KEY_ESCAPE), new ActionCommand() {
            @Override
            public void execute() {
                stateBasedGame.enterState(Main.MAIN_MENU);
            }
        });
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {

    }

    @Override
    public void controlPressed(Command command) {
        if (command instanceof ActionCommand) {
            ActionCommand actionCommand = (ActionCommand)command;
            actionCommand.execute();
        }
    }

    @Override
    public void controlReleased(Command command) {

    }

    private interface ActionCommand extends Command {
        void execute();
    }
}
