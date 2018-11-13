package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IObsGenerator;

import java.util.concurrent.Callable;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 *GetUpdateCallable class concrete MI for update
 */
public class GetUpdateCallable implements Callable {

    private IGenerator generator;
    private IObsGenerator obsGenerator;

    public GetUpdateCallable(IGenerator generator, IObsGenerator obsGenerator) {
        this.generator = generator;
        this.obsGenerator = obsGenerator;
    }

    @Override
    public Object call() throws Exception {
        obsGenerator.update(generator);
        return null;
    }
}
