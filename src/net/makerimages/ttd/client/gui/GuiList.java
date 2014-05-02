package net.makerimages.ttd.client.gui;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;

public class GuiList {

    public Sprite frame;
    public int x, y, w, h;
    public ArrayList<GuiListElement> guiListElements;
    public GuiList(int x, int y, int w, int h) {
        guiListElements = new ArrayList<GuiListElement>();
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        try {
            this.frame = new Sprite(new Image("res/textures/scrolllist.png"), 0, 0, 480, 320);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void draw() {
        this.frame.getImage().draw(this.x, this.y, this.w, this.h);
        for(int x=0; x<guiListElements.size();x++)
        {
            guiListElements.get(0).draw(this.x+2,this.y+x*40,this.w-4);
        }
    }
}
