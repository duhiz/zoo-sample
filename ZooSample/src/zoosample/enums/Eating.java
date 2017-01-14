/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosample.enums;

/**
 *
 * @author duhi
 */
public enum Eating {
    PREDATOR("Ragadozó"),
    HERBIVOROUS("Növényevő"),
    MIXED("Vegyes");
    
    private final String text;
    
    private Eating(final String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
    
}
