package net.makerimages.ttd.client.gui;
import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Created by Kodukas on 30.04.2014.
 */
public class GuiList
{
    public Sprite frame;
    public int x, y, w, h;
    public GuiList(int x, int y, int w, int h)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        try {
            this.frame=new Sprite(new Image("res/textures/scrolllist.png"),0,0,480,320);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void draw()
    {
        this.frame.getImage().draw(this.x,this.y,this.w,this.h);
    }
}
