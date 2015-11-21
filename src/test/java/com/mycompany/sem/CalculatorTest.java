package com.mycompany.sem;


import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


/**
 *
 * @author Philip
 */
public class CalculatorTest {
   
    Calculator calc = new Calculator();
    
    @BeforeClass
    public static void setUp(){
        BasicConfigurator.configure();
    }

    @Test
    public void testPlus() {
        System.out.println("plus");
        assertEquals(17, calc.plus(10, 7), 0);
        assertEquals(1, calc.plus(0.5, 0.5), 0);
        assertEquals(-1, calc.plus(0.5, -1.5), 0);
    }

    @Test
    public void testMinus() {
        System.out.println("minus");
        assertEquals(0, calc.minus(0.5, 0.5), 0);
        assertEquals(1, calc.minus(0.5, -0.5), 0);
        assertEquals(1, calc.minus(1.5, 0.5), 0);
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        assertEquals(1, calc.multiply(1, 1), 0);
        assertEquals(-1, calc.multiply(1, -1), 0);
        assertEquals(0, calc.multiply(0, 0.5), 0);
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        assertEquals(2, calc.divide(4, 2), 0.05);
        assertEquals(5.666666666666667, calc.divide(17, 3), 0.05);
        assertEquals(Double.NaN, calc.divide(4, 0), 0.05);
        assertEquals(-4, calc.divide(4, -1), 0.05);

    }

}
