/* Plane figures definitions_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class FigureTest - the class testing Figure class
 * @author Lori
 * @version 1.0 November 2017
 */
public class FigureTest {
    
    public FigureTest() {
    }

    /**
     * Test of getDefinition method, of class Figure.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Figure instance = new Figure();
        String expResult = "a plane figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        
    }
    
}
