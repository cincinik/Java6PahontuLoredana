/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class Figure - the super class of all figures.
 * @author Lori
 * @version 1.0 November 2017
 */

// Figure class, parent of Circle, Triangle, Square, Rectangle
public class Figure {
    
    // String constant to hold the common part for all figures definitions
    private static final String DEFINITION = "a plane figure ";
   
    // Method returning DEFINITION
    public String getDefinition(){
    return DEFINITION;
    }
    
}
