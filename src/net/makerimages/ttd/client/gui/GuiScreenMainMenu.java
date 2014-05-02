package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.state.TrappedTilDoomGameState;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GuiScreenMainMenu extends GuiScreen {

    @Override
    public void init() {
        super.init();
        this.buttonList.add(new GuiButton(0, 200, 100, 200, 20, "Singleplayer", true));
        this.buttonList.add(new GuiButton(1, 200, 150, 200, 20, "Options", false));
        this.buttonList.add(new GuiButton(2, 200, 200, 200, 20, "Exit", true));
    }

    @Override
    public void actionPerformed(GuiButton guiButton, StateBasedGame stateBasedGame) throws SlickException {
        super.actionPerformed(guiButton, stateBasedGame);

        switch (guiButton.id) {
            case 0:
                stateBasedGame.enterState(TrappedTilDoomGameState.SINGLE_PLAYER_MENU);
                break;
            case 2:
                stateBasedGame.getContainer().exit();
                break;
        }
    }

    @Override
    public void drawScreen(Graphics graphics) {
        drawTerraBack();
        super.drawScreen(graphics);
    }
}
