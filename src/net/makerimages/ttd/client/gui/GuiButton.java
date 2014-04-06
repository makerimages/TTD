package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class GuiButton
{
    public String text;
    public float x,y,w,h;
    public int id;
    public Sprite notHover,hover, disabled;
    public boolean enabled, isHovering;
    public GuiButton(int id, float x, float y, float w, float h, String displayText,boolean enable)
    {
        this.id=id;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.text=displayText;
        this.enabled=enable;   //TODO: add disabling
        try {
            Image guiImage=new Image("res/textures/gui.png");
            this.notHover=new Sprite(guiImage,0,0,200,20);
            this.notHover.getImage().setFilter(Image.FILTER_NEAREST);
            this.hover=new Sprite(guiImage,0,1,200,20);
            this.hover.getImage().setFilter(Image.FILTER_NEAREST);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    public Rectangle getBounds()
    {
        return new Rectangle(this.x,this.y,this.w*2,this.h*2);
    }

    public void  updateButton(GameContainer gameContainer)
    {
        Input input=gameContainer.getInput();

        int x= input.getMouseX();
        int y= input.getMouseY();

        if(enabled)
        {
            isHovering = getBounds().contains(x, y);
        }
    }

    public boolean clickedOn()
    {
        if(enabled)
        {
            if(isHovering)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public void draw()
    {
        if(enabled)
        {
            if(!isHovering)
            {
                this.notHover.getImage().draw(this.x,this.y,this.w*2,this.h*2);
            }
            else
            {
                this.hover.getImage().draw(this.x,this.y,this.w*2,this.h*2);
            }
        }
    }
}
