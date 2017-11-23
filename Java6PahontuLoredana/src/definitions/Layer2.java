/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import java.util.LinkedList;
import java.util.Scanner;

/**Class Layer2 - solves the problem with a LinkedList
 * @author Lori
 * @version 1.0 November 2017
 */
public class Layer2 {
    
    // Instances of all specific figure classes
    static Circle circle = new Circle();
    static Rectangle rectangle = new Rectangle();
    static Triangle triangle = new Triangle();
    static Square square = new Square();
    String userInput;
    
    // LinkedList to hold objects of type Figure
    LinkedList <Figure> listOfFigures;
    
    // empty String wich will be assigned with the corresponding definition
    String result = "";
       
    //Method reading user's input and adding objects to the LinkedList
    public int userList (){
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        this.listOfFigures = new LinkedList<>();
        
        // Split the input String in an array with separated substrings
        String[] arr = userInput.split(" "); 
        
        // Iterate through each element of the array, and add the found objects in the LinkedList
        for ( String figure : arr) {
            
            switch(figure){
                case "circle":
                listOfFigures.add(circle);
                break;
                case "rectangle":
                listOfFigures.add(rectangle);
                break;  
                case "triangle":
                listOfFigures.add(triangle);
                break;
                case "square":
                listOfFigures.add(square);
                break;
                default:
                System.out.println("You didn't introduced any valid figure!"); 
            }
        } 
        return listOfFigures.size();
    }
    
    // Method returning the definitions
    public String printDefinitions (){
         
       // Matching each object in the LinkedList with the corresponding definition 
        listOfFigures.forEach((inputFigure) -> {
            if (inputFigure instanceof Circle){
                result = circle.getDefinition();}
                else if (inputFigure instanceof Rectangle){
                     result = rectangle.getDefinition();}
                else if (inputFigure instanceof Square) {
                     result = square.getDefinition();}
                else if (inputFigure instanceof Triangle) {
                     result = triangle.getDefinition();}
                        
            });
        return result;
        }
    }
    


