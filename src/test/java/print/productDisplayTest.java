/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import junit.framework.TestCase;

/**
 *
 * @author Juxhin
 */
public class productDisplayTest extends TestCase {
    
    public productDisplayTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getId method, of class productDisplay.
     */
    public void testGetId() {
        System.out.println("getId");
        productDisplay instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class productDisplay.
     */
    public void testGetPrice() {
        System.out.println("getPrice");
        productDisplay instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTittle method, of class productDisplay.
     */
    public void testGetTittle() {
        System.out.println("getTittle");
        productDisplay instance = null;
        String expResult = "";
        String result = instance.getTittle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCover method, of class productDisplay.
     */
    public void testGetCover() {
        System.out.println("getCover");
        productDisplay instance = null;
        String expResult = "";
        String result = instance.getCover();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtn_status method, of class productDisplay.
     */
    public void testGetBtn_status() {
        System.out.println("getBtn_status");
        productDisplay instance = null;
        String expResult = "";
        String result = instance.getBtn_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
