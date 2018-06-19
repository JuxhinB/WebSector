/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.sql.ResultSet;
import junit.framework.TestCase;

/**
 *
 * @author Juxhin
 */
public class ProductPrintTest extends TestCase {
    
    public ProductPrintTest(String testName) {
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
     * Test of setProductInfo method, of class ProductPrint.
     */
    public void testSetProductInfo() {
        System.out.println("setProductInfo");
        ProductPrint instance = new ProductPrint();
        instance.setProductInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class ProductPrint.
     */
    public void testSetResult() {
        System.out.println("setResult");
        ResultSet result_2 = null;
        ProductPrint instance = new ProductPrint();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class ProductPrint.
     */
    public void testGetID() {
        System.out.println("getID");
        ProductPrint instance = new ProductPrint();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ProductPrint.
     */
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTittle method, of class ProductPrint.
     */
    public void testGetTittle() {
        System.out.println("getTittle");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getTittle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class ProductPrint.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCover method, of class ProductPrint.
     */
    public void testGetCover() {
        System.out.println("getCover");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getCover();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage_1 method, of class ProductPrint.
     */
    public void testGetImage_1() {
        System.out.println("getImage_1");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getImage_1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage_2 method, of class ProductPrint.
     */
    public void testGetImage_2() {
        System.out.println("getImage_2");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getImage_2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage_3 method, of class ProductPrint.
     */
    public void testGetImage_3() {
        System.out.println("getImage_3");
        ProductPrint instance = new ProductPrint();
        String expResult = "";
        String result = instance.getImage_3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
