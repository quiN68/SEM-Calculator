/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sem;

import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author Philip
 */
public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5, 3));
        System.out.println(calc.minus(5, 3));
        System.out.println(calc.multiply(5, 3));
        System.out.println(calc.divide(5, 3));
        System.out.println(calc.divide(5, 0));
    }

}
