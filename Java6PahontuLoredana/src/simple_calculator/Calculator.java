package simple_calculator;

/* Simple command line calculator
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */ 


import java.util.Scanner;

/**
 * Class Calculator. Returns results of basic arithmetic operations.
 * @author Lori
 * @version 1.0 September 2017
 */
public class Calculator {
          
    public static void main(String[] args) {
        
        System.out.println( "Please introduce your first number:");
              
        // Variable that will receive the result of the operation.
        double result = 0;
               
        try (Scanner scanner = new Scanner(System.in)){
         // Variable that will receive first user input number
         double x = scanner.nextDouble();
         
         System.out.println( "Please introduce operator(+/-/*//):");
         // Variable that will receive user input operator
         String operator = scanner.next();
         
         System.out.println( "Please introduce second number:");
        // Variable that will receive second user input number
         double y = scanner.nextDouble();
         
         // This is a switch that will evalute the input operator.
         switch (operator){
             
             case "+":
                 result = x+y;
                 break;
             case "-":
                 result = x-y;
                 break;
             case "*":
                 result = x*y;
                 break;
             case "/":
                 result = x/y;
                 break;
             // If user introduces something else instead of the 4 operators, error message appears
             default: 
                 System.out.println("Sorry, you introduced wrong operator. I quit :)");
                 System.exit(0);
         }
         System.out.println( "Please introduce =:");
         
         String calcResult = scanner.next();
        
         if ("=".equals(calcResult)) {
                  
         System.out.println( "Result is: " + result);
         
        } 
         else
          // If user introduces something else instead of =, error message appears   
         {System.out.println("Sorry, that wasn't =. I quit :)");
         System.exit(0);
         }
        
        }
                
        // If user introduces characters instead of numbers, error message appears
        catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
      }
    }
  }
