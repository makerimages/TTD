package net.makerimages.ttd.state;

import net.makerimages.ttd.client.Sprite;
import org.newdawn.slick.*;
import org.newdawn.slick.command.InputProvider;
import org.newdawn.slick.command.KeyControl;
import org.newdawn.slick.state.StateBasedGame;

public class PlayGameState extends TrappedTilDoomGameState {

    private Image image;
    private Sprite sprite;

    public PlayGameState(int id) {
        super(id);
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        image = new Image("res/textures/block-empty.png");

        sprite = new Sprite(image, 0, 0, 16, 16);
        sprite.loadSprite();
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics graphics) throws SlickException {
        sprite.getImage().draw(100, 100);
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
