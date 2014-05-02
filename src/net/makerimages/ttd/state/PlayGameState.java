package net.makerimages.ttd.state;

import net.makerimages.ttd.model.World;
import net.makerimages.ttd.view.WorldRenderer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class PlayGameState extends TrappedTilDoomGameState {

    private World world;
    private WorldRenderer worldRenderer;

    public PlayGameState(int id) {
        super(id);
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        world = World.generate();
        world.getActiveChunk().resize(container.getScreenWidth() / 16 + 1, container.getScreenHeight() / 16 + 1);

        worldRenderer = new WorldRenderer();
        worldRenderer.init();
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics graphics) throws SlickException {
        worldRenderer.render(world);
    }

    @Override
    protected void bindCommands(final GameContainer container, final StateBasedGame game, final InputProvider provider) {
        provider.bindCommand(new KeyControl(Input.KEY_ESCAPE), new ActionCommand() {
            @Override
            public void execute(boolean release) {
                if (!release) {
                    game.enterState(TrappedTilDoomGameState.MAIN_MENU);
                }
            }
        });
    }
}
