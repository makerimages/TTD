package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Created by Kodukas on 2.05.2014.
 */
public class GuiListElement {
    String text;
    Sprite sprite;
    public GuiListElement(String text) {
        this.text=text;
        try {
            this.sprite=new Sprite(new Image("res/textures/gui.png"),0,1,200,20);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    public void draw(int x,int y,int w) {
        this.sprite.getImage().draw(x,y,w,40);
    }
}
