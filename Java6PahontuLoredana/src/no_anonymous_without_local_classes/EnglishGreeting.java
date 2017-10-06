/** Anonymous Class Homework
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package no_anonymous_without_local_classes;
/**Class EnglishGreeting greets someone on the console, in English
 * @author Lori
 * @version 1.0 October 2017
 */
public class EnglishGreeting implements HelloWorld{
    String name = "world"; 
            
     @Override
     public void greet() {
          greetSomeone("world");
     }
     @Override
     public void greetSomeone(String someone) {
         name = someone;
         System.out.println("Hello " + name); 
     }
    
}
