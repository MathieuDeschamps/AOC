package application.ActiveObject.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import application.ActiveObject.Interfaces.IAlgoDIffusion;
import application.ActiveObject.Interfaces.IGenerator;

public class DiffusionAtomique implements IAlgoDIffusion {
	
	IGenerator generator;
	Canal canal;
	

	

	@Override
	public List<Future<Integer>> execute( ) {
		
		List<Future<Integer>> returnFuture = new ArrayList<>( );
		generator.getObservers().forEach( obs -> returnFuture.add( obs.update( generator ) ) );
		
		return returnFuture;
	}
	
	

	@Override
	public void configure( IGenerator generator) {
	
		this.generator = generator;
						
	}

}
