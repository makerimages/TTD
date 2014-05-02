package net.makerimages.ttd.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class SinglePlayerMenuState extends TrappedTilDoomGameState {

    public SinglePlayerMenuState(int id) {
        super(id);
    }

    @Override
    protected void bindCommands(final GameContainer container, final StateBasedGame game, final InputProvider provider) {
        provider.bindCommand(new KeyControl(Input.KEY_ESCAPE), new ActionCommand() {
            @Override
            public void execute(boolean release) {
                if (!release) {
                    game.enterState(TrappedTilDoomGameState.MAIN_MENU);
                }
            }
        });
    }

    @Override
    public int getID() {
        return this.id;
    }
}
