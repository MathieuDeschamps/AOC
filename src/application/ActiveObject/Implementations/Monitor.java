package application.ActiveObject.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;


import application.ActiveObject.Interfaces.IGeneratorAsync;
import application.ActiveObject.Interfaces.IMonitor;
import application.ActiveObject.Interfaces.IMonitorObserver;
import javafx.application.Platform;

/**
 * 
 * @author DESCHAMPS MAthieu && LARZILLIERE Charles
 *
 */
public class Monitor implements IMonitor {

	private int nMonitor;
	private List<IMonitorObserver> monitorObservers = new ArrayList<>();

	public Monitor(int nMonitor) {
		this.nMonitor = nMonitor;
	}

	@Override
	public void update(IGeneratorAsync generatorAsync) {

		Future<Integer> value = generatorAsync.getValue();
		try {
			notify(value.get());
		} catch (Exception e) {
			System.out.println("Error future getValue: " + e.getMessage());

		}

	}

	@Override
	public void attach(IMonitorObserver obs) {
		monitorObservers.add(obs);

	}

	@Override
	public void detach(IMonitorObserver obs) {
		monitorObservers.remove(obs);

	}

	@Override
	public void notify(Integer value) {
		
		// Handle IllegalStateException.
		Platform.runLater(()->{
			monitorObservers.forEach(obs -> {
				obs.update(nMonitor, value);
			});
			
		});
		

	}

}
