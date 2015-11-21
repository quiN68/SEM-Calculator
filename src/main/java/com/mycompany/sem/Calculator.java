package com.mycompany.sem;

import org.apache.log4j.Logger;

/**
 *
 * @author Philip
 */
public class Calculator {

    Logger log = Logger.getLogger(this.getClass());

    public Calculator() {
    }

    public double plus(double a, double b) {
        log.info("Adding " + b + " to " + a);
        return a + b;
    }

    public double minus(double a, double b) {
        log.info("Subtracting " + b + " from " + a);
        return a - b;
    }

    public double multiply(double a, double b) {
        log.info("Multiplying " + a + " with " + b);
        return a * b;
    }

    public double divide(double a, double b) {
        log.info("Dividing " + a + " by " + b);
        if (b != 0) {
            return a / b;
        }
        return Double.NaN;
    }

}
