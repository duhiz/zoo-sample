/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosample.animals;

import java.awt.Color;
import zoosample.enums.Habitat;
import zoosample.enums.Home;
import zoosample.enums.Eating;

/**
 *
 * @author duhi
 */
public abstract class AbstractAnimal {
    private Color animalColor;
    private int animalWeight;
    private Habitat animalHabitat;
    private Home animalHome;
    private Eating animalEating;
    
    protected AbstractAnimal(){
    }

    public AbstractAnimal(Color animalColor, int animalWeight, Habitat animalHabitat, Home animalHome, Eating animalEating) {
        this.animalColor = animalColor;
        this.animalWeight = animalWeight;
        this.animalHabitat = animalHabitat;
        this.animalHome = animalHome;
        this.animalEating = animalEating;
    }

    public Color getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(Color animalColor) {
        this.animalColor = animalColor;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Habitat getAnimalHabitat() {
        return animalHabitat;
    }

    public void setAnimalHabitat(Habitat animalHabitat) {
        this.animalHabitat = animalHabitat;
    }

    public Home getAnimalHome() {
        return animalHome;
    }

    public void setAnimalHome(Home animalHome) {
        this.animalHome = animalHome;
    }

    public Eating getAnimalEating() {
        return animalEating;
    }

    public void setAnimalEating(Eating animalEating) {
        this.animalEating = animalEating;
    }
    
    
    
}
