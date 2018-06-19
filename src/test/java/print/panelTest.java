/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Juxhin
 */
public class panelTest extends TestCase {
    
    public panelTest(String testName) {
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
     * Test of sales method, of class panel.
     */
    public void testSales() throws Exception {
        System.out.println("sales");
        panel instance = new panel();
        ArrayList expResult = null;
        ArrayList result = instance.sales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of products method, of class panel.
     */
    public void testProducts() throws Exception {
        System.out.println("products");
        panel instance = new panel();
        ArrayList expResult = null;
        ArrayList result = instance.products();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of users method, of class panel.
     */
    public void testUsers() throws Exception {
        System.out.println("users");
        panel instance = new panel();
        ArrayList expResult = null;
        ArrayList result = instance.users();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
