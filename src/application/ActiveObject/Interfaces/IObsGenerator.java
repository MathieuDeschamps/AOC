package application.ActiveObject.Interfaces;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *Observer generator interface (servant role for update, client role for get)
 */
public interface IObsGenerator {

	/**
	 * 
	 * @param generator generator to update
	 */
    public void update(IGenerator generator);
}
