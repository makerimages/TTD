package net.makerimages.ttd.model;

import com.sudoplay.joise.module.Module;
import com.sudoplay.joise.module.ModuleGradient;
import com.sudoplay.joise.module.ModuleSelect;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class World {

    private final Module module;
    private final WorldChunk chunk;

    private World(Module module) {
        this.module = module;
        this.chunk = new WorldChunk(module);
    }

    public WorldChunk getActiveChunk() {
        return chunk;
    }

    public static World generate() {
        ModuleGradient groundGradient = new ModuleGradient();
        groundGradient.setGradient(0, 0, 0, 1);

        ModuleSelect groundSelect = new ModuleSelect();
        groundSelect.setLowSource(0);
        groundSelect.setHighSource(1);
        groundSelect.setThreshold(0.5);
        groundSelect.setControlSource(groundGradient);

        return new World(groundSelect);
    }

    public static World load() {
        throw new NotImplementedException();
    }

    public static World save(){throw new NotImplementedException();}
}
