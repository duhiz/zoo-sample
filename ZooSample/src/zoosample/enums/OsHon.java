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
public enum OsHon {
    EUROPA("Európa"),
    AZSIA("Ázsia"),
    AUSZTRALIA("Ausztrália"),
    AFRIKA("Afrika"),
    AMERIKA("Amerika"),
    DELI_SARK("Déli-sark"),
    ESZAKI_SARK("Északi-sark"),
    OCEAN("Óceán"),
    TENGER("Tenger");
    
    private final String text;

    private OsHon(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
}
