package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;

import java.util.concurrent.Callable;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 * UpdateCallable class concrete MI role for getValue
 */
public class UpdateCallable implements Callable {

	private Canal canal;
	private ObsGenerator obsgGen;
    @Override
    public Object call() throws Exception {

        // @TODO faire le update de g sur le monitor ?
        return null;
    }

    public void update(IGenerator generator){
    	
    }
}
