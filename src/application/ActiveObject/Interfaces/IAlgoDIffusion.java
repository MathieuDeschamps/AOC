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
	public void configure( IGenerator generator );
	
	
	
	
}
