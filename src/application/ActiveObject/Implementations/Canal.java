package application.ActiveObject.Implementations;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IGeneratorAsync;
import application.ActiveObject.Interfaces.IObsGeneratorAsync;

/**
 * 
 * @author DESCHAMPS Mathieu && LARZILLIERE Charles
 * Canal class Proxy role for update and get
 *
 */
public class Canal implements IObsGeneratorAsync, IGeneratorAsync {

	ExecutorService es = Executors.newFixedThreadPool( 4 );
	
	
	@Override
	public Future<Integer> getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<Integer> update(IGenerator generator) {
		// TODO Auto-generated method stub
		return null;
	}

   
}
