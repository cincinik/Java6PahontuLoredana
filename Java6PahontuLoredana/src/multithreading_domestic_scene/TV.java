/* package for multithreading domestic scene
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multithreading_domestic_scene;

/**Class TV: Gives the synchronization object for Man and Woman
 * @author Lori
 * @version 1.0 December 2017
 */
public class TV {
    
    /** Method for the TV running before the show starts. */
    public void showOff(){
        System.out.println("There's nothing interesting on TV.");
    }
    
    /** Method announcing the TV show has started and it's running  */
    public void showOn(){
        System.out.println("Boring soap opera has started."); 
    }
}
