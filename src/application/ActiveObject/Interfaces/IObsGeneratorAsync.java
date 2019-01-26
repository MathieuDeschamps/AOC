package application.ActiveObject.Interfaces;

import java.util.concurrent.Future;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 */
public interface IObsGeneratorAsync {

	/**
	 * 
	 * @param generator generator to update 
	 * @return Future<Void>
	 */
    public Future<Void> update (IGenerator generator);
}
