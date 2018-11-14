package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IObsGenerator;
import application.ActiveObject.Interfaces.IObsGeneratorAsync;

import java.util.ArrayList;
import java.util.List;


public class Generator implements IGenerator {

    private int value;

    private List<IObsGeneratorAsync> observers = new ArrayList<>();


    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void attach(IObsGenerator observer) {

    }

    @Override
    public void detach(IObsGenerator observer) {

    }

    public void setValue(int value){
        this.value = value;
        //faire le execute de DiffusionAtomique(generator)
    }

	@Override
	public List<IObsGeneratorAsync> getObservers() {
		// TODO Auto-generated method stub
		return null;
	}


}
