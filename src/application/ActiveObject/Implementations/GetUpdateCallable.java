package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IGeneratorAsync;
import application.ActiveObject.Interfaces.IGetCallable;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 *GetUpdateCallable class concrete MI for update
 */
public class GetUpdateCallable implements IGetCallable {

    private IGeneratorAsync generatorAsync;
    private IGenerator generator;
    
    public GetUpdateCallable(IGenerator generator, IGeneratorAsync generatorAsync) {
        this.generator = generator;
        
    }

    @Override
    public Integer call() throws Exception {
        return generator.getDiffusion( ).getValue( generatorAsync );
    }
}
