package application.ActiveObject.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import application.ActiveObject.Interfaces.IAlgoDIffusion;
import application.ActiveObject.Interfaces.IDiffusionGen;
import application.ActiveObject.Interfaces.IGeneratorAsync;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 * 
 * Algo de diffusion atomique
 *
 */
public class DiffusionAtomique implements IAlgoDIffusion {
	
	
	private Integer value;
	
	private List<IGeneratorAsync> asyncGenerators;
	private IDiffusionGen generator;
	private int monitor_number;
	
	

	public DiffusionAtomique( List<IGeneratorAsync> asyncGenerators) {
		this.asyncGenerators = asyncGenerators;
	}

	@Override
	public List<Future<Integer>> execute( ) {
		
		List<Future<Integer>> returnFutures = new ArrayList<>( );
		value = generator.getValue();
		asyncGenerators = new ArrayList<>();
		monitor_number = generator.getObservers().size();
		
		
		generator.getObservers().forEach( obs -> returnFutures.add( obs.update( generator ) ) );
		
		return returnFutures;
	}
	
	

	@Override
	public void configure( IDiffusionGen generator ) {
	
		this.generator = generator;
						
	}



	@Override
	public boolean verify() {
		
		if( asyncGenerators == null || (asyncGenerators.size() != monitor_number ) ){
			return false;
		}
		return true;
	}



	@Override
	public Integer getValue(IGeneratorAsync generator) {
		
		if (!asyncGenerators.contains(generator)) {
			asyncGenerators.add(generator);
		}
		return value;
	}

}
