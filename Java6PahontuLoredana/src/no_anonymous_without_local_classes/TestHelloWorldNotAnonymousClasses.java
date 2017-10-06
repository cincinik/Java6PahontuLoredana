/* Anonymous Class Homework
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package no_anonymous_without_local_classes;

/**Class TestHelloWorldNotAnonymousClasses greets on the console in English, French and Spanish
 * @author Lori
 * @version 1.0 October 2017
 */
public class TestHelloWorldNotAnonymousClasses {

 /**Class TestCalculator. Runs the calculator
 * @author Lori
 * @version 1.0 September 2017
 */
    public static void main(String[] args) {
        EnglishGreeting englishGreeting = new EnglishGreeting();
        FrenchGreeting frenchGreeting = new FrenchGreeting();
        SpanishGreeting spanishGreeting = new SpanishGreeting();
        
        englishGreeting.greet(); 
        frenchGreeting.greetSomeone("Fred"); 
        spanishGreeting.greet();
        
     }
    
}
