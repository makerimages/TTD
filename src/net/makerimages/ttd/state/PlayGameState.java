package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class PlayGameState extends TrappedTilDoomGameState {

    public PlayGameState(int id) {
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
}
