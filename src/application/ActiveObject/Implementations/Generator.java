package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author DESCHAMPS Mathieu && (De) LARZILLIÈRE Charles
 * Generator implementation
 *
 */
public class Generator implements IDiffusionGen 
{

    private int value;

    private IAlgoDIffusion diffusion;
    
    private List<IObsGeneratorAsync> observerList = new ArrayList<>();

    
    public Generator(IAlgoDIffusion algoDifusion) {
    	diffusion = algoDifusion;
    }
    
    @Override
    public int getValue( ) 
    {
        return value;
    }

    /**
     * add the obserer in this.observerList
     * @param observer
     */
    @Override
    public void attach( IObsGeneratorAsync observer ) 
    {
        observerList.add( observer );
    }

    /**
     * Remove the observer from the list
     * @param observer
     */
    @Override
    public void detach( IObsGeneratorAsync observer )
    {
        observerList.remove( observer );
    }

    /**
     *
     * @return the observer list
     */
    @Override
    public List<IObsGeneratorAsync> getObservers( )
    {
        return observerList;
    }

   

    @Override
    public IAlgoDIffusion getDiffusion( ) 
    {
        return diffusion;
    }

	@Override
	public void generate( )
	{
		this.value = new Random( ).nextInt( 20 );
		diffusion.configure(this);
		diffusion.execute();		
	}

	@Override
	public void setDiffusion(IAlgoDIffusion algo) {
		diffusion = algo;
		
	}
}
