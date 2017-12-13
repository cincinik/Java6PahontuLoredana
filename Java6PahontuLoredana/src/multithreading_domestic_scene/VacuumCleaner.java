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
    
    /**@Override method inherited from superclass Thread that implements Runnable. */
    @Override
    public void run(){
        System.out.println("Man's vacuuming...");
    }
}
