package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class GuiButton
{
    public String text;
    public float x,y,w,h;
    public int id;
    public Sprite sprite;
    public GuiButton(int id, float x, float y, float w, float h, String displayText)
    {
        this.id=id;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.text=displayText;
        try {
            this.sprite=new Sprite(new Image("res/textures/gui.png"),0,0,(int) this.w,(int)this.h);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
