/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farenheit;

import Converter.Converter;

/**
 *
 * @author CAP
 */
public class Far2Kel implements Converter{

    @Override
    public double convert(double input) {
        return (input -32)/1.8 + 273.15;
    }

    
    
}
