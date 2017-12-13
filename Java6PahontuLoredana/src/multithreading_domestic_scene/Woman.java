/* package for multithreading domestic scene
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multithreading_domestic_scene;

/**Class Woman: Wife is sleeping, waiting for her TV show to start
 * @author Lori
 * @version 1.0 December 2017
 */

public class Woman extends Thread {
    // an instance of TV
    final TV tv;
    
    // passing a TV to the constructor
    public Woman(TV existingTV) {
        tv = existingTV;
    }
    
    /** Method saying the lady is sleeping */
    public void isSleeping (){
        System.out.println("The lady of the house is sleeping, waiting for her show to start.");
    }
    
    /** Method saying the lady is waking up, as the show has started */
    public void isAwaikening (){
        System.out.println("Ohh, it's on?! I must wake up to see the new episode!");
    }
   
    /** @Override method inherited from superclass Thread that implements Runnable. */
    @Override
    public void run(){
       // synchronizing on the tv object
       synchronized (tv){
        try{
            // she is sleeping until the show
            isSleeping();
            // waiting for the notification
            tv.wait();
           } catch(InterruptedException e){
             e.getStackTrace();}
        // TV show has started
        tv.showOn();
        }
       // Pausing the thread for 2 seconds, so the man can tell her that the show has started, before she starts to speak
        try { Thread.sleep(2000);
            } catch(InterruptedException e){
              e.getStackTrace();}
       // The show have started so she is waking up
       isAwaikening();
    }
}
