package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IGeneratorAsync;

import java.util.concurrent.Callable;

public class GetValueCallable implements Callable {

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
