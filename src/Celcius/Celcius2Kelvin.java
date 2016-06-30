/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celcius;

import Converter.Converter;

/**
 *
 * @author CAP
 */
public class Celcius2Kelvin implements Converter{

    @Override
    public double convert(double input) {
        return input + 273.15;
    }

   
    
    
}
