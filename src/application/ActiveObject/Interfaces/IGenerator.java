package application.ActiveObject.Interfaces;

import java.util.List;
import java.util.Observer;

/**
 *
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 *
 *Generator interface (client role for update, servantRole for getValue)
 */
public interface IGenerator {

	/**
	 *
	 * @return the value
	 */
    public int getValue();


	/**
	 * Attach an observer
	 * @param observerAsync
	 */
	public void attach(IObsGeneratorAsync observer);


	/**
	 *Detach an observer
	 * @param observerAsync
	 */
	public void detach(IObsGeneratorAsync observer);


	/**
	 * 
	 * @return List<IObsGeneratorAsync>
	 */
	public List<IObsGeneratorAsync> getObservers();

	/**
	 * 
	 * @return the Diffusion
	 */
	public IAlgoDIffusion getDiffusion();
	
	public void setDiffusion (IAlgoDIffusion algo);
	
	/**
	 * Generate a new value
	 */
	public void generate( );



}
