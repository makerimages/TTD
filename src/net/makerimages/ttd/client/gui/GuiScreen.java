package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

import java.util.*;

public class GuiScreen {

    public ArrayList<GuiButton> buttonList = new ArrayList<GuiButton>();
    public Sprite terraBack;

    public GuiScreen() {
        this.init();
    }

    public void drawTerraBack() {
        for (int i = 0, j = 0, k = 0; i <= 50 && j <= 38; i++, k++) {
            if (i == 50) {
                i -= 50;
                j++;
                k = 0;
            }
            terraBack.getImage().draw(0 + k * 16, 0 + j * 16);
        }
    }

    public void drawScreen(Graphics graphics) {
        for (Object aButtonList : this.buttonList) {
            GuiButton guibutton = (GuiButton)aButtonList;
            guibutton.draw(graphics);
        }
    }

    public void actionPerformed(GuiButton guiButton, StateBasedGame stateBasedGame) throws SlickException {

    }

    public void init() {
        try {
            terraBack = new Sprite(new Image("res/textures/terrain.png"), 1, 0, 16, 16);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void getMouseClickOn(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        Input input = gameContainer.getInput();
        if (input.isMousePressed(0)) {
            for (Object aButtonList : this.buttonList) {
                GuiButton guibutton = (GuiButton)aButtonList;
                if (guibutton.clickedOn()) {
                    this.actionPerformed(guibutton, stateBasedGame);
                }
            }
        }
    }

    public void updateScreen(GameContainer gameContainer, StateBasedGame stateBasedGame) {
        for (Object aButtonList : this.buttonList) {
            GuiButton guibutton = (GuiButton)aButtonList;
            guibutton.updateButton(gameContainer);
        }

        try {
            getMouseClickOn(gameContainer, stateBasedGame);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
