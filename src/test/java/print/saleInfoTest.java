/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.sql.Timestamp;
import junit.framework.TestCase;

/**
 *
 * @author Juxhin
 */
public class saleInfoTest extends TestCase {
    
    public saleInfoTest(String testName) {
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
     * Test of getId method, of class saleInfo.
     */
    public void testGetId() {
        System.out.println("getId");
        saleInfo instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSales method, of class saleInfo.
     */
    public void testGetSales() {
        System.out.println("getSales");
        saleInfo instance = null;
        int expResult = 0;
        int result = instance.getSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class saleInfo.
     */
    public void testGetDate() {
        System.out.println("getDate");
        saleInfo instance = null;
        Timestamp expResult = null;
        Timestamp result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFn method, of class saleInfo.
     */
    public void testGetFn() {
        System.out.println("getFn");
        saleInfo instance = null;
        String expResult = "";
        String result = instance.getFn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLn method, of class saleInfo.
     */
    public void testGetLn() {
        System.out.println("getLn");
        saleInfo instance = null;
        String expResult = "";
        String result = instance.getLn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
