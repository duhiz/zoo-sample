/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosample.animals;

import java.awt.Color;
import zoosample.enums.Elohely;
import zoosample.enums.OsHon;
import zoosample.enums.Taplalkozas;

/**
 *
 * @author duhi
 */
public abstract class AbstractAllat {
    private Color allatSzine;
    private String allatHangja;
    private int jellemzoSulya;
    private boolean kifutos;
    private Elohely elohely;
    private OsHon oshon;
    
    protected AbstractAllat(){
    }

    public Color getAllatSzine() {
        return allatSzine;
    }

    public void setAllatSzine(Color allatSzine) {
        this.allatSzine = allatSzine;
    }

    public String getAllatHangja() {
        return allatHangja;
    }

    public void setAllatHangja(String allatHangja) {
        this.allatHangja = allatHangja;
    }

    public int getJellemzoSulya() {
        return jellemzoSulya;
    }

    public void setJellemzoSulya(int jellemzoSulya) {
        this.jellemzoSulya = jellemzoSulya;
    }

    public boolean isKifutos() {
        return kifutos;
    }

    public void setKifutos(boolean kifutos) {
        this.kifutos = kifutos;
    }

    public Elohely getElohely() {
        return elohely;
    }

    public void setElohely(Elohely elohely) {
        this.elohely = elohely;
    }

    public OsHon getOshon() {
        return oshon;
    }

    public void setOshon(OsHon oshon) {
        this.oshon = oshon;
    }
    
}
