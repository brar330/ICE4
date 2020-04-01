/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexercise4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class InClassExercise4Test {
    
    public InClassExercise4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class InClassExercise4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InClassExercise4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iteration method, of class InClassExercise4.
     */
    @Test
    public void testIteration() {
        System.out.println("iteration");
        char letter = ' ';
        String word = "";
        int expResult = 0;
        int result = InClassExercise4.iteration(letter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of counting method, of class InClassExercise4.
     */
    @Test
    public void testCounting() {
        System.out.println("counting");
        char firstLetter = ' ';
        char secondLetter = ' ';
        String word = "";
        char expResult = ' ';
        char result = InClassExercise4.counting(firstLetter, secondLetter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specified method, of class InClassExercise4.
     */
    @Test
    public void testSpecified() {
        System.out.println("specified");
        char letter = ' ';
        String word = "";
        boolean expResult = false;
        boolean result = InClassExercise4.specified(letter, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
