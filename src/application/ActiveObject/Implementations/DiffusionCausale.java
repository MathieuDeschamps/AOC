package application.ActiveObject.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import application.ActiveObject.Interfaces.IAlgoDIffusion;
import application.ActiveObject.Interfaces.IDiffusionGen;
import application.ActiveObject.Interfaces.IGeneratorAsync;

/**
 * 
 * @author DESCHAMPS Mathieu && DE LARZILLIERE Charles
 *	Causal Diffusion strategy. The simplest strategy
 */
public class DiffusionCausale implements IAlgoDIffusion
{

	private Integer value;
	IDiffusionGen diffGen;
	@Override
	public List<Future<Void>> execute() 
	{
		value = diffGen.getValue( );
		List<Future<Void>> futures =  new ArrayList<>( );
		diffGen.getObservers().forEach( obs -> futures.add( obs.update( diffGen ) ) );
		return futures;
	}

	@Override
	public void configure( IDiffusionGen generator )
	{
		this.diffGen = generator;
		
	}

	@Override
	public Integer getValue( IGeneratorAsync generator )
	{
		return value;
	}

}
