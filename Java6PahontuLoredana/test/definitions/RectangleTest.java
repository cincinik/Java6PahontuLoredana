/* Plane figures definitions_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class RectangleTest - the class testing Rectangle class
 * @author Lori
 * @version 1.0 November 2017
 */
public class RectangleTest {
    
    public RectangleTest() {
    }

    /**
     * Test of getDefinition method, of class Rectangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Rectangle instance = new Rectangle();
        String expResult = "RECTANGLE: a plane figure with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        
    }
    
}
