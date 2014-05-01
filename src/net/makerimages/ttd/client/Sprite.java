package net.makerimages.ttd.client;

import com.sun.org.apache.xml.internal.utils.IntVector;
import org.newdawn.slick.Image;

import java.awt.*;

/**
 * Created by Makerimages on 4.01.14.
 */
public class Sprite {

    private Image sheet, image;
    private int x, y;
    private int sizeX;
    private int sizeY;

    public Sprite(Image sheet, int x, int y, int sizeX,int sizeY) {
        this.sheet = sheet;
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY=sizeY;
        this.loadSprite();
    }

    public void loadSprite() {
        try {
            image = sheet.getSubImage(x * sizeX, y * sizeY, sizeX, sizeY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Image getSheet() {
        return sheet;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



}