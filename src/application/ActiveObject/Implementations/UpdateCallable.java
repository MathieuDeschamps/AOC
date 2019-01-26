package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.ICallableUpdate;
import application.ActiveObject.Interfaces.IObsGenerator;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 * UpdateCallable class concrete MI role for getValue
 */
public class UpdateCallable implements ICallableUpdate {

	private Canal canal;
	private IObsGenerator obsgGen;
	
	public UpdateCallable( Canal canal, IObsGenerator obsGenerator) {
		this.canal = canal;
		this.obsgGen = obsGenerator;
	}

	@Override
	public Void call() throws Exception {
		obsgGen.update(canal);
		return null;
	}
   

    
}
