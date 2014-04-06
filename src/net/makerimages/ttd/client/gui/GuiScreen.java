package net.makerimages.ttd.client.gui;

import java.util.*;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class GuiScreen
{
    public ArrayList<GuiButton> buttonList;

    public GuiScreen()
    {
        buttonList=new ArrayList<GuiButton>();
        Init();
    }

    public void Init()
    {
        buttonList.clear();
    }
}
