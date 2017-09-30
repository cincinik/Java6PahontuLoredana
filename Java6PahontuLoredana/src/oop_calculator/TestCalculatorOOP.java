/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**Class TestCalculator. Runs the calculator
 * @author Lori
 * @version 1.0 September 2017
 */
public class TestCalculatorOOP {

    static Calculator calculator = new Calculator();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Starts the computer.
        calculator.start();
                
        // Read first operand.
        calculator.insertNumbers();
               
        // Read operator.
        calculator.insertOperator();
        // read second operand on a line (enter confirms the number is ready)
        
        // Read second operand.
        calculator.insertNumbers();
        // read first operand on a line (enter confirms the number is ready)
       
        // On equals calculate returns the result.
        calculator.insertEqual();        
    }
    
}