package application.ActiveObject.Interfaces;

import java.util.concurrent.Future;

public interface ObsGeneratorAsync {

    public Future update (Generator generator);
}
