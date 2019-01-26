package application.ActiveObject.Interfaces;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 * 
 *
 */
public interface IMonitorObservable {
	
	
	/**
	 * Add an oberserver to the monitor
	 * @param obs
	 */
	void attach( IMonitorObserver obs );
	
	/**
	 * Remove an observer to the monitor
	 * @param obs
	 */
	void detach( IMonitorObserver obs );
	
	/**
	 * Notify the observers
	 * @param value
	 */
	void notify( Integer value);

}
