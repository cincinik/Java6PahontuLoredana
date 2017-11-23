/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class Circle - the class holding the circle definition.
 * @author Lori
 * @version 1.0 November 2017
 */

// Circle inherits from Figure
public class Circle extends Figure {
    
    // Circle specific definition
    private static final String DEFINITION = "CIRCLE: whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    
    // Overridden method, inherited from parent class Figure
    @Override
    public String getDefinition(){
    
    // String variable that will receive the parent common definition, valid for all figures
    String figureDefinition = super.getDefinition();
    
    // Create an empty StringBuilder variable to hold the entire circle definition
    StringBuilder circleDefinition = new StringBuilder("");
    
    // Put the content of specific circle definition in the Stringbuilder
    circleDefinition.append(DEFINITION);
    
    // Insert the parent definition after the 8th character of the StringBuuilder
    circleDefinition.insert(8, figureDefinition);
    
    // Print the definition
    System.out.println(circleDefinition.toString());
    return circleDefinition.toString();
    
    } 
}
