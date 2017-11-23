/* Plane figures definitions
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

/**Class Triangle - the class holding the rectangle definition.
 * @author Lori
 * @version 1.0 November 2017
 */

// Triangle inherits from Figure
public class Triangle extends Figure {
    
    // Triangle specific definition
    private static final String DEFINITION = "TRIANGLE: with three straight sides and three angles.";
    
    // Overridden method, inherited from parent class Figure
    @Override  
    public String getDefinition(){
    
    // String variable that will receive the parent common definition, valid for all figures     
    String figureDefinition = super.getDefinition();
   
    // Create an empty StringBuilder variable to hold the entire triangle definition    
    StringBuilder triangleDefinition = new StringBuilder("");
    
    // Put the content of specific triangle definition in the Stringbuilder    
    triangleDefinition.append(DEFINITION);
    
    // Insert the parent definition after the 10th character of the StringBuuilder   
    triangleDefinition.insert(10, figureDefinition);
   
    // Print the definition    
    System.out.println(triangleDefinition.toString());
    return triangleDefinition.toString();
    
    }
    
}

   
