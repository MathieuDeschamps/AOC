package application.ActiveObject.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.xml.ws.WebServiceException;

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
public class DiffusionAtomique implements IAlgoDIffusion
{
	
	
	private Integer value;
	
	private List<IGeneratorAsync> asyncGenerators = new ArrayList<>();
	private IDiffusionGen difGenerator;
	private int monitor_number;
	
	

	

	@Override
	public List<Future<Void>> execute( ) 
	{
		
		if( asyncGenerators.size() == monitor_number )
		{
			asyncGenerators = new ArrayList<>( );
			value = difGenerator.getValue( );				
		}
		else
		{
			return null;
		}

		List<Future<Void>> returnFutures = new ArrayList<>( );
		value = difGenerator.getValue();
		asyncGenerators = new ArrayList<>();
		monitor_number = difGenerator.getObservers().size();
		
		
		difGenerator.getObservers().forEach( obs -> returnFutures.add( obs.update( difGenerator ) ) );
		
		return returnFutures;
	}
	
	

	@Override
	public void configure( IDiffusionGen difGenerator ) 
	{
	
		this.difGenerator = difGenerator;
						
	}



	@Override
	public Integer getValue( IGeneratorAsync generator ) 
	{
		
		if ( !asyncGenerators.contains( generator ) ) 
		{
			asyncGenerators.add( generator );
		}
		return value;
	}

}
