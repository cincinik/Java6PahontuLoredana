/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

import java.util.Scanner;

/**Class Button receives the input from user and compute the two numbers.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Button {
   
   String allButtons[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-", "*", "/", "="};
       
    Scanner scanner = new Scanner(System.in);
    
    Double x;
    Double y;
    String operator;
    Double result;
    // Reads first number input.
    public double firstNumber(){
        x = scanner.nextDouble();
        return x;
    }
    // Reads operator input.
    public String operator(){
        operator = scanner.next();
        return operator;
    }
   // Reads second number input.
    public double secondNumber(){
        y = scanner.nextDouble();
        return y;
    }
    // Adds 2 numbers.
    private double add() {
        result = x + y;
        return result;
    }
    // Substracts two numbers.
    private double substract(){
        result = x-y;
        return result;
    }
    //Multiples two number.
    private double multiply(){
        result = x*y;
        return result;
    }
    //Divides two numbers.
    private double divide(){
        result = x/y;
        return result;
    }
    // Makes the computation according to input operator.
    public double compute(){
        
    switch (operator){
             
             case "+":
                 add();
                 break;
             case "-":
                 substract();
                 break;
             case "*":
                 multiply();
                 break;
             case "/":
                 divide();
                 break;
                      }
            return result;
        }
    // Returns the result when = key is pressed.
    public double equal(){
        if ("=".equals(scanner.next())){
            compute();
        }
        else {
            System.out.println("This button doesn't exist");
        }
       return result;
    }
         
}