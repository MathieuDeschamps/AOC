package application.ActiveObject.Interfaces;

import java.util.List;
import java.util.concurrent.Future;

/**
 * 
 * @author DESCHAMPS Mathieu
 *
 *AlgoDiffusion interface - Strategy role for Startegy DP
 */
public interface IAlgoDIffusion {
	
	
	/**
	 * execute algodiffusion
	 */
	public List<Future<Integer>> execute();
	
	
	/**
	 * configure algoDiffusion
	 */
	public void configure( IDiffusionGen generator );
	
	/**
	 * Verify if a new value can be generate
	 * @return a value can be generate
	 */
	public boolean verify( );
	
	/**
	 * 
	 * @param generator the generator
	 * @return the generator's values
	 */
	Integer getValue( IGeneratorAsync generator );
	
	
	
	
}
