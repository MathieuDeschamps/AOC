package application.ActiveObject.Interfaces;

import java.util.List;
import java.util.concurrent.Future;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 *AlgoDiffusion interface - Strategy role for Strategy DP
 */
public interface IAlgoDIffusion {
	
	
	/**
	 * execute algodiffusion
	 */
	public List<Future<Void>> execute();
	
	
	/**
	 * configure algoDiffusion
	 */
	public void configure( IDiffusionGen generator );
	
	
	/**
	 * 
	 * @param generator the generator
	 * @return the generator's values
	 */
	Integer getValue( IGeneratorAsync generator );
	
	
	
	
}
