/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Radian;
/**
 *
 * @author CAP
 */
import Converter.Converter;


public class Rad2Deg implements Converter {

    @Override
    public double convert(double input) {
        return input * 180/Math.PI;
    }

 

   
}
