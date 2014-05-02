package net.makerimages.ttd.model;

import com.sudoplay.joise.module.Module;

public class WorldChunk {

    private Module module;
    private int width = 0;
    private int height = 0;
    private int[][] blocks;

    private float scale = 50;
    private float offsetX = 0;
    private float offsetY = 0;

    public WorldChunk(Module module) {
        this.module = module;
        refresh();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getBlock(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return blocks[y][x];
        }
        return 0;
    }

    public void setOffset(float dx, float dy) {
        offsetX += dx;
        offsetY += dy;
        refresh();
    }

    public void setScale(float scale) {
        this.scale = Math.max(scale, 1.0f);
        refresh();
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
        blocks = new int[height][width];
        refresh();
    }

    public void refresh() {
        //TODO: Tie block update logic to here :D
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double nx = (x + offsetX) / scale;
                double ny = (y + offsetY) / scale;
                blocks[y][x] = (int)module.get(nx, ny);
            }
        }
    }
}
