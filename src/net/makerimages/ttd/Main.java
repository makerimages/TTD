package net.makerimages.ttd;

import net.makerimages.ttd.state.MainMenuState;
import net.makerimages.ttd.state.SinglePlayerMenuState;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class Main extends StateBasedGame
{
    public static final String VERSION="1.0a4 indev";
    public Main(String title)
    {
        super(title);
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException
    {

        addState(new MainMenuState(0));
        addState(new SinglePlayerMenuState(1));
    }


    public void create() throws SlickException
    {
        AppGameContainer appGameContainer=new AppGameContainer(this);
        appGameContainer.setDisplayMode(800, 600, false);
        appGameContainer.setVSync(true);
        appGameContainer.start();

    }

    public static void main(String[] args) throws SlickException
    {
        Main main=new Main("Trapped 'til Doom v: "+VERSION);
        main.create();
    }


}
