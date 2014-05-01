package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import net.makerimages.ttd.client.gui.GuiScreenMainMenu;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenuState extends BasicGameState {

    private final int id;
    private final GuiScreenMainMenu guiScreenMainMenu = new GuiScreenMainMenu();

    public MainMenuState(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

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
