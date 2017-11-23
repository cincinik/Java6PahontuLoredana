/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class Square - the class holding the square definition.
 * @author Lori
 * @version 1.0 November 2017
 */

// Square inherits from Figure
public class Square extends Figure {
    
    // Square specific definition
    private static final String DEFINITION = "SQUARE: with four equal straight sides and four right angles.";
    
    // Overridden method, inherited from parent class Figure
    @Override
    public String getDefinition(){
    
    // String variable that will receive the parent common definition, valid for all figures      
    String figureDefinition = super.getDefinition();
    
    // Create an empty StringBuilder variable to hold the entire square definition    
    StringBuilder squareDefinition = new StringBuilder("");
    
    // Put the content of specific square definition in the Stringbuilder    
    squareDefinition.append(DEFINITION);
    
    // Insert the parent definition after the 8th character of the StringBuuilder    
    squareDefinition.insert(8, figureDefinition);
    
    // Print the definition    
    System.out.println(squareDefinition.toString());
    return squareDefinition.toString();
    
    }
    
}
