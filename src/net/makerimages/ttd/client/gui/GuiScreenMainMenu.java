package net.makerimages.ttd.client.gui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Makerimages on 19.04.2014.
 */
public class GuiScreenMainMenu extends GuiScreen
{
    
    public GuiScreenMainMenu()
    {
        super();


    }

    @Override
    public void init() {
        super.init();
        this.buttonList.add(new GuiButton(0,200,100,200,20,"Singleplayer",true));
        this.buttonList.add(new GuiButton(1,200,150,200,20,"Options", false));
        this.buttonList.add(new GuiButton(2,200,200,200,20,"Exit", true));
    }

    @Override
    public void actionPerformed(GuiButton guiButton, StateBasedGame stateBasedGame) throws SlickException {
        super.actionPerformed(guiButton, stateBasedGame);
        switch (guiButton.id)
        {
            case 0:
                stateBasedGame.enterState(1);
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
