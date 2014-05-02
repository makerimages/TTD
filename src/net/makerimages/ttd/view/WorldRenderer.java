package net.makerimages.ttd.view;

import net.makerimages.ttd.client.Sprite;
import net.makerimages.ttd.model.World;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class WorldRenderer {

    private Image image;
    private Sprite sprite;

    public void init() throws SlickException {
        image = new Image("res/textures/block-empty.png");

        sprite = new Sprite(image, 0, 0, 16, 16);
        sprite.loadSprite();
    }

    public void render(World world) {
        sprite.getImage().draw(100, 100);
    }
}
