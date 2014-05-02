package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

import java.io.InputStream;

/**
 * Created by Kodukas on 2.05.2014.
 */
public class GuiListElement {
    private String text;
    private Sprite sprite;
    private TrueTypeFont buttonFont;
    public GuiListElement(String text) {
        this.text=text;
        try {
            this.sprite=new Sprite(new Image("res/textures/gui.png"),0,1,200,20);
        } catch (SlickException e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStream = ResourceLoader.getResourceAsStream("res/fonts/Main.ttf");
            java.awt.Font awtFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, inputStream);
            awtFont = awtFont.deriveFont(18f); // set font size
            buttonFont = new TrueTypeFont(awtFont, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void draw(int x,int y,int w) {
        this.sprite.getImage().draw(x,y,w,40);
        buttonFont.drawString(x + (w- buttonFont.getWidth(this.text)) / 2, y + buttonFont.getHeight(this.text) / 2, this.text);

    }
}
