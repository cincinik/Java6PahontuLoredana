/* Anonymous Class Homework
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package no_anonymous_without_local_classes;

/**Class FrenchGreeting greets someone on the console, in French
 * @author Lori
 * @version 1.0 October 2017
 */
public class FrenchGreeting implements HelloWorld {
     String name = "tout le monde"; 
     @Override
     public void greet() {
         greetSomeone("tout le monde"); 
    }

     @Override
     public void greetSomeone(String someone) {
         name = someone;
         System.out.println("Salut " + name); 
    }
 }
