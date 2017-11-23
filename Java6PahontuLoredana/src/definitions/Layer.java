/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import java.util.Scanner;

/**Class Layer - solves the problem without collections
 * @author Lori
 * @version 1.0 November 2017
 */

public class Layer {
   
    // Instances of all specific figure classes
    static Circle circle = new Circle();
    static Rectangle rectangle = new Rectangle();
    static Triangle triangle = new Triangle();
    static Square square = new Square();
    String userInput;
    
    //Method reading user's input and returning definitions
    public String userList (){
        
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        
        // variable that will hold the specific definition. I assigned it with an empty String
        String result="";
        
        // Split the input String in an array with separated substrings
        String[] arrayOfFigures = userInput.split(" "); 
        
        // Iterate through each element of the array, to match each string with figure name to the corresponding definition
        for ( String figure : arrayOfFigures) {
            
            switch(figure){
                case "circle":
                result = circle.getDefinition();
                break;
                case "rectangle":
                result = rectangle.getDefinition();
                break;   
                case "triangle":
                result = triangle.getDefinition();
                break; 
                case "square":
                result = square.getDefinition();
                break;
                default:
                result = "You didn't introduced any valid figure!";
            }
        }
        return result;
        
    }
}
