package application.ActiveObject.Implementations;

import application.ActiveObject.Interfaces.IGenerator;
import application.ActiveObject.Interfaces.IObsGenerator;
import application.ActiveObject.Interfaces.IObsGeneratorAsync;

import java.util.ArrayList;
import java.util.List;


public class Generator implements IGenerator {

    private int value;

    //private IAlgoDiffusion diffusion;

    private List<IObsGeneratorAsync> observerList = new ArrayList<>();

    /**
     * Generate a random value between 0 and 100
     */
    public void generate(){
        setValue((int) Math.random()*100);
    }


    /**
     * Return la valeur de value
     * @return Int value
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * Ajoute l'observer dans la liste
     * @param observer
     */
    @Override
    public void attach(IObsGeneratorAsync observer) {
        observerList.add(observer);
    }

    /**
     * Supprimer l'observer de la liste
     * @param observer
     */
    @Override
    public void detach(IObsGeneratorAsync observer) {
        observerList.add(observer);
    }

    /**
     *
     * @return la liste des observer
     */
    @Override
    public List<IObsGeneratorAsync> getObservers() {
        return observerList;
    }

    /**
     * Change la valeur value et execute la diffusion
     * @param value
     */
    public void setValue(int value){
        this.value = value;
        //diffusion.execute(this)
    }



}
