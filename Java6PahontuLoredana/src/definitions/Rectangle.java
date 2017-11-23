/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class Rectangle - the class holding the rectangle definition.
 * @author Lori
 * @version 1.0 November 2017
 */

// Rectangle inherits from Figure
public class Rectangle extends Figure {
    
    // Rectangle specific definition
    private static final String DEFINITION ="RECTANGLE: with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.";
    
    // Overridden method, inherited from parent class Figure
    @Override
    public String getDefinition(){
    
    // String variable that will receive the parent common definition, valid for all figures    
    String figureDefinition = super.getDefinition();
    
    // Create an empty StringBuilder variable to hold the entire rectangle definition
    StringBuilder rectangleDefinition = new StringBuilder("");
    
    // Put the content of specific rectangle definition in the Stringbuilder
    rectangleDefinition.append(DEFINITION);
    
    // Insert the parent definition after the 11th character of the StringBuuilder
    rectangleDefinition.insert(11, figureDefinition);
    
    // Print the definition
    System.out.println(rectangleDefinition.toString());
    return rectangleDefinition.toString();
    }
    
}
