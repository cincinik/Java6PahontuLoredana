/* package for multithreading domestic scene
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multithreading_domestic_scene;

/**Class that is testing the scene
 * @author Lori
 * @version 1.0 December 2017
 */
public class TestScene {

    
    public static void main(String[] args) {
        
        // Create a Cigar instance 
        Cigar cigar = new Cigar();
        // Starting cigar's thread creates new method stack
        new Thread(cigar).start();
        
         // Create a VacuumCleaner instance 
        VacuumCleaner vacuum = new VacuumCleaner();
         // Starting vacuums's thread, creates new method stack
        new Thread(vacuum).start();
        
        // Create a TV instance 
        TV tv = new TV();
        
        // Create a Woman instance 
        Woman woman = new Woman(tv);
        // Starting woman's thread, creates new method stack
        new Thread(woman).start();
        
        // Create a Man instance 
        Man man = new Man(tv);
        // Starting man's thread, creates new method stack
        new Thread(man).start();
    }  
}
