package application.ActiveObject.Implementations;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import application.ActiveObject.Interfaces.ICallableUpdate;
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


	private static final int THREAD_NUMBER = 10;
	private IObsGenerator obsGenerator;

	private ScheduledExecutorService getEs;
	private ScheduledExecutorService updateEs;
	private IGenerator generator;
	private int delay;

	
	public Canal( IObsGenerator obsGen, IGenerator gen ) {
		
		 delay = new Random().nextInt( 3000 );
		 getEs = Executors.newScheduledThreadPool( THREAD_NUMBER );
		 updateEs = Executors.newScheduledThreadPool( THREAD_NUMBER );
		 obsGenerator = obsGen;
		 generator = gen;
	}
	
	@Override
	public Future<Integer> getValue() {
		GetValueCallable gvc = new GetValueCallable(this, generator);
		return getEs.schedule(gvc, delay, TimeUnit.MILLISECONDS);
	}

	@Override
	public Future<Void> update(IGenerator generator) {
		this.generator = generator;
		ICallableUpdate callable = new UpdateCallable(this, obsGenerator);
		return updateEs.schedule( callable, delay, TimeUnit.MILLISECONDS);

	}

   
}
