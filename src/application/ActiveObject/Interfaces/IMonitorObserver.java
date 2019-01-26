package application.ActiveObject.Interfaces;
/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 *
 *Oberserver interface for the monitor
 */
public interface IMonitorObserver {

	/**
	 * 
	 * @param nMonitor the monitor's id to update
	 * @param value the value
	 */
	void update( int nMonitor, Integer value);
}
