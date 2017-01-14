/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoosample.interfaces;

import zoosample.enums.Eating;

/**
 *
 * @author duhi
 */
public interface IPredator {
    public static final Eating EATING = Eating.PREDATOR;
    void vadaszik();
}
