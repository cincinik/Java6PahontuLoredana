/* OOP calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 
package oop_calculator;

/**Class Processor - process the computations.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Processor {
    
    private Double firstNumber;
    private Double secondNumber;
    private Double result;
    private Character operator;

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    
    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }

    
    // Adds numbers input
    private Double add(){
        result = firstNumber + secondNumber;
        return result;
    }
    
    // Substracts numbers input
    private Double substract(){
        result = firstNumber - secondNumber;
        return result;
    }
    
    // Multiplies numbers input
    private Double multiply(){
        result = firstNumber * secondNumber;
        return result;
    }
    
    // Divides numbers input
    private Double divide(){
        result = firstNumber / secondNumber;
        return result;
    }
    
    // Choose the corresponding operator method to compute
    public Double compute(){
        
        switch(operator){
            case'+':
                add();
                break;
            case'-':
                substract();
                break;   
            case'*':
                multiply();
                break;  
            case'/':
                divide();
                break;     
        }
        return result;
    }
}