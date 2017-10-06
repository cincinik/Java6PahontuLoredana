/* Anonymous Class Homework
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package no_anonymous_without_local_classes;

/**Class SpanishGreeting greets someone on the console, in Spanish
 * @author Lori
 * @version 1.0 October 2017
 */
public class SpanishGreeting implements HelloWorld {
     String name = "mundo"; 
     @Override
     public void greet() {
         greetSomeone("mundo"); 
    }

     @Override
     public void greetSomeone(String someone) {
         name = someone;
         System.out.println("Hola, " + name); 
    }
}
