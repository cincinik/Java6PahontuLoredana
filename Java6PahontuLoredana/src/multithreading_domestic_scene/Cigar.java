/* package for multithreading domestic scene
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multithreading_domestic_scene;

/**Class Cigar: a forgotten cigar that is burning
 * @author Lori
 * @version 1.0 December 2017
 */
public class Cigar extends Thread {
    
    
    private void isBurning(){
        System.out.println("A forgotten cigar is burning...");
    }
    
    /**@Override method inherited from superclass Thread that implements Runnable  */
    @Override
    public void run(){
       isBurning();
    }
}
