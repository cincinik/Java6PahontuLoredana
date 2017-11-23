/* Plane figures definitions_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class TriangleTest - the class testing Triangle class
 * @author Lori
 * @version 1.0 November 2017
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    /**
     * Test of getDefinition method, of class Triangle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triangle instance = new Triangle();
        String expResult = "TRIANGLE: a plane figure with three straight sides and three angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        
    }
    
}
