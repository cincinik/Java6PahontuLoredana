/* Plane figures definitions_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**Class LayerTest - the class testing Layer class
 * @author Lori
 * @version 1.0 November 2017
 */
public class LayerTest {
    
    public LayerTest() {
    }

    /**
     * Test of userList method, of class Layer.
     */
    @Test
    public void testUserList() {
        System.out.println("userList test");
        Layer instance = new Layer();
        ByteArrayInputStream in = new ByteArrayInputStream("circle".getBytes());
        System.setIn(in);
        String result = instance.userList();
        String expectedResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
        assertEquals(result,expectedResult);
        
        }
    }
