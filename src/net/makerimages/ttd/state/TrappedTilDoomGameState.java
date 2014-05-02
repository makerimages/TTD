package net.makerimages.ttd.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public abstract class TrappedTilDoomGameState extends BasicGameState {

    public static final int MAIN_MENU = 0;
    public static final int SINGLE_PLAYER_MENU = 1;
    public static final int PLAY_GAME = 2;

    public final int id;

    protected TrappedTilDoomGameState(int id) {
        this.id = id;
    }

    protected void bindCommands(final GameContainer container, final StateBasedGame game, final InputProvider provider) {

    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void init(GameContainer container, StateBasedGame stateBasedGame) throws SlickException {

    }

    @Override
    public void render(GameContainer container, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {

    }

    @Override
    public void update(GameContainer container, StateBasedGame stateBasedGame, int i) throws SlickException {

    }

    @Override
    public void enter(final GameContainer container, final StateBasedGame game) throws SlickException {
        InputProvider provider = new InputProvider(container.getInput());
        provider.addListener(new ActionCommandAdapter());
        bindCommands(container, game, provider);
    }

    @Override
    public void leave(GameContainer container, StateBasedGame game) throws SlickException {
        container.getInput().removeAllListeners();
    }
}
