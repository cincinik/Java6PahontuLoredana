/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**
 * Class Screen displays the input numbers and results.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Screen {

    Double screenMemory;
    Button myButton = new Button();
   
    // Sets initial value to 0.
    public void clear(){
         System.out.println("Display: 0");
         screenMemory = 0.0;
    }
    // Displays first user input number.
    public void displayFirstNumber(){
        System.out.print("Introduce first number and press Enter: ");
        screenMemory = myButton.firstNumber();
        System.out.println("Display: " + screenMemory);
    }
    // Displays user input operator
    public void displayOperator(){
        System.out.print("Introduce operand and press Enter: ");
        System.out.println("Display: " + myButton.operator());
    }
    // Displays second user input number.
    public void displaySecondNumber(){
        System.out.print("Introduce second number and press Enter: ");
        screenMemory = myButton.secondNumber();
        System.out.println("Display: " + screenMemory);
    }
    // Displays result of computation.   
    public void displayResult(){
        System.out.print("Introduce = and press Enter to see result: ");
        screenMemory = myButton.equal();
        System.out.println("Display: " + screenMemory);
    }
}
