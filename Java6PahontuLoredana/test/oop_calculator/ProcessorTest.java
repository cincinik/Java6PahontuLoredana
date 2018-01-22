/* OOP_Calculator_Tests
 * Version 1.0
 * © 2017 Lori, Inc. All rights reserved.
 */
package oop_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class ProcessorTest - the class testing Processor class
 * @author Lori
 * @version 1.0 November 2017
 */
public class ProcessorTest {
    
    public ProcessorTest() {
    }

    /**
     * Test of getFirstNumber method, of class Processor.
     */
    @Test
    public void testGetFirstNumber() {
        Processor instance = new Processor();
        Double expResult = 1.25;
        instance.setFirstNumber(1.25);
        Double result = instance.getFirstNumber();
        assertEquals(expResult, result);
        System.out.println("getFirstNumber " + result);
        
    }

    /**
     * Test of setFirstNumber method, of class Processor.
     */
    @Test
    public void testSetFirstNumber() {
        Double firstNumber = 1.25;
        Processor instance = new Processor();
        instance.setFirstNumber(1.25);
        Double result = instance.getFirstNumber();
        assertEquals(result, firstNumber);
        System.out.println("setFirstNumber " + result);
        
    }

    /**
     * Test of getOperator method, of class Processor.
     */
    @Test
    public void testGetOperator() {
        Processor instance = new Processor();
        Character expResult = '+';
        instance.setOperator('+');
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        System.out.println("getOperator " + result);
        
    }

    /**
     * Test of setOperator method, of class Processor.
     */
    @Test
    public void testSetOperator() {
        Character operator = '+';
        Processor instance = new Processor();
        instance.setOperator(operator);
        Character result = instance.getOperator();
        assertEquals(operator, result);
        System.out.println("setOperator " + result);
        
    }

    /**
     * Test of getSecondNumber method, of class Processor.
     */
    @Test
    public void testGetSecondNumber() {
        Processor instance = new Processor();
        Double expResult = 1.75;
        instance.setSecondNumber(1.75);
        Double result = instance.getSecondNumber();
        assertEquals(expResult, result);
        System.out.println("getSecondNumber " + result);
        
    }

    /**
     * Test of setSecondNumber method, of class Processor.
     */
    @Test
    public void testSetSecondNumber() {
        Double secondNumber = 1.75;
        Processor instance = new Processor();
        instance.setSecondNumber(secondNumber);
        Double result = instance.getSecondNumber();
        assertEquals(secondNumber, result);
        System.out.println("setSecondNumber " + result);
        
    }

    /**
     * Test of compute method, of class Processor.
     */
    @Test
    public void testCompute() {
        Processor instance = new Processor();
        // Test add
        instance.setFirstNumber(1.5);
        instance.setSecondNumber(2.5);
        instance.setOperator('+');
        Double resultAdd = instance.compute();
        Double expResultAdd = 4.00;
        assertEquals(expResultAdd, resultAdd);
        System.out.println("compute add: " + resultAdd);
        //Test multiply
        instance.setOperator('*');
        Double resultMultiply = instance.compute();
        Double expResultMultiply = 3.75;
        assertEquals(expResultMultiply, resultMultiply);
        System.out.println("compute multiply: " + resultMultiply);
        //Test divide
        instance.setOperator('/');
        Double resultDivide = instance.compute();
        Double expResultDivide = 0.6;
        assertEquals(expResultDivide, resultDivide);
        System.out.println("compute divide: " + resultDivide);
        //Test substract
        instance.setOperator('-');
        Double resultSubstract = instance.compute();
        Double expResultSubstract = -1.00;
        assertEquals(expResultSubstract, resultSubstract);
        System.out.println("compute substract: " + resultSubstract);
    }
    
}
