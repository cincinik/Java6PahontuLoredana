package oop_calculator;

/*
 * Test calculator
 */

/**
 *Class test calculator
 * @author VORTEX
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Calculator instance
        Calculator computer = new Calculator();
        // start the Calculator
        computer.start();
        // test the add of 123 + 113
        computer.add();
        // test 233-122
        computer.decrease();
        // test 123*12
        computer.multiply();
        // test 24:6
        computer.divide();
    }
    
}
