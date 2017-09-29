/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**
 * Class ComputerOOP assembles the Screen and and the buttons.
 * @author Lori
 * @version 1.0 September 2017
 */
public class ComputerOOP {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Screen theScreen = new Screen();
        
     // Start the calculator. Displays 0.
        theScreen.clear();
     // Ask to introduce 1st number and displays it.  
        theScreen.displayFirstNumber();
     // Ask to introduce operator and displays it. 
        theScreen.displayOperator();
     // Ask to introduce 2nd number and displays it. 
        theScreen.displaySecondNumber();
     // Displays result.                  
        theScreen.displayResult();
    }
}
