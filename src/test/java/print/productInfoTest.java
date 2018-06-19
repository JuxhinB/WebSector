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
public class productInfoTest extends TestCase {
    
    public productInfoTest(String testName) {
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
     * Test of getId method, of class productInfo.
     */
    public void testGetId() {
        System.out.println("getId");
        productInfo instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class productInfo.
     */
    public void testGetPrice() {
        System.out.println("getPrice");
        productInfo instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSales method, of class productInfo.
     */
    public void testGetSales() {
        System.out.println("getSales");
        productInfo instance = null;
        int expResult = 0;
        int result = instance.getSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTittle method, of class productInfo.
     */
    public void testGetTittle() {
        System.out.println("getTittle");
        productInfo instance = null;
        String expResult = "";
        String result = instance.getTittle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class productInfo.
     */
    public void testGetDesc() {
        System.out.println("getDesc");
        productInfo instance = null;
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class productInfo.
     */
    public void testGetCategory() {
        System.out.println("getCategory");
        productInfo instance = null;
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrdDate method, of class productInfo.
     */
    public void testGetPrdDate() {
        System.out.println("getPrdDate");
        productInfo instance = null;
        Timestamp expResult = null;
        Timestamp result = instance.getPrdDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
