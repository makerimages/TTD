package net.makerimages.ttd.state;

import net.makerimages.ttd.Main;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Makerimages on 6.04.2014.
 */
public class MainMenuState extends BasicGameState
{
    public int id;

    public MainMenuState(int id)
    {
        this.id=id;
    }
    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException
    {

    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException
    {
        graphics.drawString(Main.VERSION,10,gameContainer.getHeight()-16);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException
    {

    }
}
