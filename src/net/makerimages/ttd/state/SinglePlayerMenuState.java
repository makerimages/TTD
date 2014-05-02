package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import net.makerimages.ttd.client.gui.GuiScreenSinglePlayerMenu;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class SinglePlayerMenuState extends TrappedTilDoomGameState {
    private GuiScreenSinglePlayerMenu guiScreenSinglePlayerMenu=new GuiScreenSinglePlayerMenu();

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

    @Override
    public void render(GameContainer container, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        guiScreenSinglePlayerMenu.drawScreen(graphics);
        graphics.drawString(Main.VERSION, 10, container.getHeight() - 16);
        super.render(container, stateBasedGame, graphics);
    }
}
