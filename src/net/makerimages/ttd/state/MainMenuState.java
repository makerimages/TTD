package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import net.makerimages.ttd.client.gui.GuiScreenMainMenu;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenuState extends TrappedTilDoomGameState {

    private final GuiScreenMainMenu guiScreenMainMenu = new GuiScreenMainMenu();

    public MainMenuState(int id) {
        super(id);
    }

    @Override
    protected void bindCommands(final GameContainer container, final StateBasedGame game, final InputProvider provider) {
        provider.bindCommand(new KeyControl(Input.KEY_F1), new ActionCommand() {
            @Override
            public void execute(boolean release) {
                if (!release) {
                    game.enterState(TrappedTilDoomGameState.PLAY_GAME);
                }
            }
        });
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        guiScreenMainMenu.drawScreen(graphics);
        graphics.drawString(Main.VERSION, 10, gameContainer.getHeight() - 16);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        guiScreenMainMenu.updateScreen(gameContainer, stateBasedGame);
    }
}
