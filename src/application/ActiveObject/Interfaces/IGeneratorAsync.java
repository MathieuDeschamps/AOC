package application.ActiveObject.Interfaces;

import java.util.concurrent.Future;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 * GeneratorAsync interface
 */
public interface IGeneratorAsync {

	/**
	 * 
	 * @return Future<Integer>
	 */
    public Future<Integer> getValue();
}
