package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.util.ResourceLoader;

import java.awt.*;
import java.io.InputStream;

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
    private TrueTypeFont buttonFont;
    public GuiButton(int id, float x, float y, float w, float h, String displayText,boolean enable)
    {
        this.id=id;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.text=displayText;
        this.enabled=enable;   //TODO: add disabling method
        try {
            Image guiImage=new Image("res/textures/gui.png");
            this.notHover=new Sprite(guiImage,0,0,200,20);
            this.notHover.getImage().setFilter(Image.FILTER_NEAREST);
            this.hover=new Sprite(guiImage,0,1,200,20);
            this.hover.getImage().setFilter(Image.FILTER_NEAREST);
            this.disabled=new Sprite(guiImage,0,2,200,20);
            this.disabled.getImage().setFilter(Image.FILTER_NEAREST);
        } catch (SlickException e) {
            e.printStackTrace();
        }
        try
        {
            InputStream inputStream	= ResourceLoader.getResourceAsStream("res/fonts/Main.ttf");
            java.awt.Font awtFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, inputStream);
            awtFont = awtFont.deriveFont(20f); // set font size
            buttonFont = new TrueTypeFont(awtFont, false);
        }
        catch (Exception e)
        {
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

    public void draw(Graphics g)
    {


        if(enabled)
        {
            if(!isHovering)
            {
                notHover.getImage().setCenterOfRotation(100, 10);
                notHover.getImage().draw(this.x,this.y,this.w*2,this.h*2);
                buttonFont.drawString((float)this.x+(this.w*2-buttonFont.getWidth(this.text))/2,(float)this.y+buttonFont.getHeight(this.text)/2,this.text);

            }
            else
            {

                hover.getImage().draw(this.x, this.y, this.w * 2, this.h * 2);
                buttonFont.drawString((float)this.x+(this.w*2-buttonFont.getWidth(this.text))/2,(float)this.y+buttonFont.getHeight(this.text)/2,this.text,Color.gray);

            }
        }
        else
        {
            disabled.getImage().draw(this.x, this.y, this.w * 2, this.h * 2);
            buttonFont.drawString((float)this.x+(this.w*2-buttonFont.getWidth(this.text))/2,(float)this.y+buttonFont.getHeight(this.text)/2,this.text, Color.gray);

        }
    }
}
