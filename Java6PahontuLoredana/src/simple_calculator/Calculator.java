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
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println( "Please introduce your first number:");
              
        // Variable that will receive the result of the operation.
        double result = 0;
               
        try (Scanner scanner = new Scanner(System.in)){
         
         double x = scanner.nextDouble();
         
         System.out.println( "Please introduce operator(+/-/*//):");
         
         String operator = scanner.next();
         
         System.out.println( "Please introduce second number:");
        
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
             default: 
                 System.out.println("Sorry, you introduced wrong data. I quit :)");
                 System.exit(0);
         }
         System.out.println( "Please introduce =:");
         
         String calcResult = scanner.next();
        
         if ("=".equals(calcResult)) {
                  
         System.out.println( "Result is: " + result);
         
        } 
         else
             
         {System.out.println("Sorry, you introduced wrong data. I quit :)");
         System.exit(0);
         }
        
        }
                
        // This is a generic Exception handler that will point use of invalid characters instead of numbers.
        catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
      }
    }
  }
