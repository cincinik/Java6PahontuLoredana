/* package for multithreading domestic scene
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multithreading_domestic_scene;

/**Class VacuumCleaner: Helps the man clean the house
 * @author Lori
 * @version 1.0 December 2017
 */
public class VacuumCleaner extends Thread{
    
    // Define an ON/OFF button for the vacuum cleaner, using a flag
    private boolean powerButton = false;
    
    // Setter method for private variable
    public void setPowerButton(boolean powerButton) {
        this.powerButton = powerButton;
    }
    
    // Method for cleaning, when powerButton is on        
    private void isCleaning(){
        if (powerButton){
             System.out.println("Man's vacuuming...");
        }
    }
    
    
    /**@Override method inherited from superclass Thread that implements Runnable. */
    @Override
    public void run(){
        isCleaning();
    }
}
