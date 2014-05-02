package net.makerimages.ttd.view;

import net.makerimages.ttd.client.Sprite;
import net.makerimages.ttd.model.World;
import net.makerimages.ttd.model.WorldChunk;
import org.newdawn.slick.Color;
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
        WorldChunk chunk = world.getActiveChunk();
        Image image = sprite.getImage();
        for (int x = 0; x < chunk.getWidth(); x++) {
            for (int y = 0; y < chunk.getHeight(); y++) {
                switch (chunk.getBlock(x, y)) {
                    case 1:
                        image.draw((float)(x * 16), (float)(y * 16), Color.green);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
