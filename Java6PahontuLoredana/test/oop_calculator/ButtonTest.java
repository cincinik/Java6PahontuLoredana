/* OOP_Calculator_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package oop_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class ButtonTest - the class testing Button class
 * @author Lori
 * @version 1.0 November 2017
 */
public class ButtonTest {
    
    public ButtonTest() {
    }

    /**
     * Test of assignButtons method, of class Button.
     */
    @Test
    public void testAssignButtons() {
        System.out.println("assignButtons");
        Character label = 'a';
        Button instance = new Button();
        instance.assignButtons('a');
        Character result = instance.pushedButton();
        assertEquals(label, result);
        
    }
    /**
     * Test of pushedButton method, of class Button.
     */
    @Test
    public void testPushedButton() {
        System.out.println("pushedButton");
        Button instance = new Button();
        Character expResult = 'b';
        instance.assignButtons('b');
        Character result = instance.pushedButton();
        assertEquals(expResult, result);
        
    }
    
}
