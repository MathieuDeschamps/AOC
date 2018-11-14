package application.ActiveObject.Implementations;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IGeneratorAsync;
import application.ActiveObject.Interfaces.IObsGenerator;
import application.ActiveObject.Interfaces.IObsGeneratorAsync;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 * Canal class Proxy role for update and get
 *
 */
public class Canal implements IObsGeneratorAsync, IGeneratorAsync {


	private IObsGenerator obsGenerator;

	private ScheduledExecutorService executorService;

	@Override
	public Future<Integer> getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<Integer> update(IGenerator generator) {
		GetUpdateCallable guc = new GetUpdateCallable(generator, obsGenerator);
		return executorService.schedule(guc, 5000, TimeUnit.MILLISECONDS);
	}

   
}
