package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.Generator;
import application.ActiveObject.Interfaces.GeneratorAsync;
import application.ActiveObject.Interfaces.ObsGeneratorAsync;

import java.util.concurrent.Future;

public class Canal implements ObsGeneratorAsync, GeneratorAsync {

    @Override
    public Future getValue() {
        return null;
    }

    @Override
    public Future update(Generator generator) {
        return null;
    }
}
