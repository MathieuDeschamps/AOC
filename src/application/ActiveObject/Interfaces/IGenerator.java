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
	 *
	 * @param observer
	 */
	public void attach(IObsGenerator observer);


	/**
	 *
	 * @param observer
	 */
	public void detach(IObsGenerator observer);


	public List<IObsGeneratorAsync> getObservers();


}
