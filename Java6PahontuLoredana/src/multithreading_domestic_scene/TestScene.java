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
        // Create a VacuumCleaner instance 
        VacuumCleaner vacuum = new VacuumCleaner();
        // Create a TV instance 
        TV tv = new TV();
        // Create a Man instance 
        Man man = new Man(tv, vacuum);
        // Create a Woman instance 
        Woman woman = new Woman(tv, cigar);
        
        // Set maximum priority to increase chances of executing first or second
        cigar.setPriority(10);
        // Starting cigar's thread creates new method stack
        new Thread(cigar).start();
        
        // Set maximum priority to increase chances of executing first or second
        man.setPriority(10);
        // Starting man's thread, creates new method stack
        new Thread(man).start();
        
        // Setting priority to 9, so man's thread starts first and turn on the PowerButton
        vacuum.setPriority(9);
        // Starting vacuums's thread, creates new method stack
        new Thread(vacuum).start();
        
        woman.setPriority(8);               
        // Starting woman's thread, creates new method stack
        new Thread(woman).start();
    }  
}
