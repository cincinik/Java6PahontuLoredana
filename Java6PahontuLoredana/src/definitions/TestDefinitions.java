/* Definitions of geometric figures
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class TestDefinitions - is the main class of definitions
 * @author Lori
 * @version 1.0 November 2017
 */

public class TestDefinitions {
        public static void main(String[] args) {
        
        // Instances of Layer and Layer2 classes
        Layer layer = new Layer();
        Layer2 layerz = new Layer2();
        
        // A very simple solution, without collections
        System.out.println("The following method will test a very simple solution, presented in Layer class.");
        System.out.println("I can show you the definitions for circle, triangle, square and/or rectangle. Please enter figures, in lowercase, separated by spaces. (Ex: circle circle rectangle)");
        layer.userList();
        
        // The required solution, with LinkedList
        System.out.println("");
        System.out.println("The following method will test the LinkedList solution, presented in Layer2 class.");
        System.out.println("I can show you the definitions for circle, triangle, square and/or rectangle. Please enter figures, in lowercase, separated by spaces. (Ex: circle circle rectangle)");
        layerz.userList();
        layerz.printDefinitions();
    }
    
}
