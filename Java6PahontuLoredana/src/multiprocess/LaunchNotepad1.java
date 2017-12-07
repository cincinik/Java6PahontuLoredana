/* package for multiprocess
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package multiprocess;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**Class LaunchNotepad1 - the class that launches 3 instances of Notepad
 * @author Lori
 * @version 1.0 December 2017
 */
public class LaunchNotepad1 {

    /** main method launching 3 Notepad instances
     * @param args 
     */
    public static void main(String[] args) {
        try { 
        ProcessBuilder pb;
        // instantiate pb to a ProcessBuilder, using notepad directory as argument
        pb = new ProcessBuilder("notepad");
        pb.directory(new File("C:\\Users\\VORTEX\\Desktop\\notepad"));
        // Use process builder pb to start 3 Notepad processes 
        Process p1 = pb.start();
        Process p2 = pb.start();
        Process p3 = pb.start();
        } catch (IOException ex) {
        Logger.getLogger(LaunchNotepad1.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
    
