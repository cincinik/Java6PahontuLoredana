/* Plane figures definitions_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package definitions;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**Class Layer2Test - the class testing Layer2 class
 * @author Lori
 * @version 1.0 November 2017
 */
public class Layer2Test {
    
    public Layer2Test() {
    }

    /**
     * Test of userList method, of class Layer2.
     */
    @Test
    public void testUserList() {
        System.out.println("userList test");
        Layer2 instance = new Layer2();
        ByteArrayInputStream in = new ByteArrayInputStream("triangle".getBytes());
        System.setIn(in);
        int expectedResult = instance.userList();
        assertEquals(1,expectedResult);
        
    }

    /**
     * Test of printDefinitions method, of class Layer2.
     */
    @Test
    public void testPrintDefinitions() {
        System.out.println("printDefinitions test");
        Layer2 instance = new Layer2();
        ByteArrayInputStream in = new ByteArrayInputStream("square".getBytes());
        System.setIn(in);
        instance.userList();
        String expectedResult = "SQUARE: a plane figure with four equal straight sides and four right angles.";
        String result = instance.printDefinitions();
        assertEquals(result, expectedResult);
        
    }
    
}
