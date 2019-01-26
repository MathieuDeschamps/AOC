package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IGeneratorAsync;
import application.ActiveObject.Interfaces.IGetCallable;

import java.util.concurrent.Callable;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 */
public class GetValueCallable implements IGetCallable {

    private IGenerator generator;
    private IGeneratorAsync generatorAsync;

    public GetValueCallable(IGeneratorAsync iGeneratorAsync, IGenerator generator) {
        this.generatorAsync = iGeneratorAsync;
        this.generator = generator;
    }


    @Override
    public Integer call() throws Exception {
        return generator.getDiffusion().getValue(generatorAsync);
    }
}
