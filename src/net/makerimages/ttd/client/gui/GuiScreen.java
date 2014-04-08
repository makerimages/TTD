package net.makerimages.ttd.client.gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import java.util.*;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class GuiScreen
{
    public ArrayList buttonList = new ArrayList();

    public GuiScreen()
    {
        this.init();
    }

    public void drawScreen(Graphics graphics)
    {
        for (Object aButtonList : this.buttonList) {
            GuiButton guibutton = (GuiButton) aButtonList;
            guibutton.draw();
        }

    }
    public void actionPerformed(GuiButton guiButton,StateBasedGame stateBasedGame) throws SlickException {}

    public void init()
    {

    }

    public void getMouseClickOn(GameContainer gameContainer,StateBasedGame stateBasedGame) throws SlickException {
        Input input=gameContainer.getInput();
        if(input.isMousePressed(0))
        {
            for (Object aButtonList : this.buttonList) {
                GuiButton guibutton = (GuiButton) aButtonList;
                if(guibutton.clickedOn())
                {
                    this.actionPerformed(guibutton,stateBasedGame);
                }
            }
        }
    }

    public void updateScreen(GameContainer gameContainer,StateBasedGame stateBasedGame)
    {
        for (Object aButtonList : this.buttonList) {
            GuiButton guibutton = (GuiButton) aButtonList;
            guibutton.updateButton(gameContainer);
        }
        try {
            getMouseClickOn(gameContainer,stateBasedGame);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
