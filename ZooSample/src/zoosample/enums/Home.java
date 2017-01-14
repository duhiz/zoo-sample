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
public enum Home {
    EUROPE("Európa"),
    ASIA("Ázsia"),
    AUSTRALIA("Ausztrália"),
    AFRICA("Afrika"),
    AMERICA("Amerika"),
    SOUTH_POLE("Déli-sark"),
    NORTH_POLE("Északi-sark"),
    OCEAN("Óceán"),
    SEA("Tenger");
    
    private final String text;

    private Home(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
}
