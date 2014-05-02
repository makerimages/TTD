package net.makerimages.ttd.client.gui;

import org.newdawn.slick.Graphics;

/**
 * Created by Kodukas on 2.05.2014.
 */
public class GuiScreenSinglePlayerMenu extends GuiScreen
{
    private GuiList guiList;

    public  GuiScreenSinglePlayerMenu () {

        init();
    }
    @Override
    public void init() {
        guiList=new GuiList(170,100,480,320);
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));
        guiList.guiListElements.add(new GuiListElement("Not Important test text, will be save name"));



    }

    @Override
    public void drawScreen(Graphics graphics) {
        drawTerraBack();
        guiList.draw();
        super.drawScreen(graphics);
    }
}
