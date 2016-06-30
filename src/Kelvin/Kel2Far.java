/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelvin;

import Converter.Converter;
import Celcius.Celcius2Far;

/**
 *
 * @author CAP
 */
public class Kel2Far implements Converter {

    @Override
    public double convert(double input) {
        return (input - 273.15)*1.8  + 32;
    }

    
    
    
}
