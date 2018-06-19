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
public class userInfoTest extends TestCase {
    
    public userInfoTest(String testName) {
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
     * Test of getId method, of class userInfo.
     */
    public void testGetId() {
        System.out.println("getId");
        userInfo instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFn method, of class userInfo.
     */
    public void testGetFn() {
        System.out.println("getFn");
        userInfo instance = null;
        String expResult = "";
        String result = instance.getFn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLn method, of class userInfo.
     */
    public void testGetLn() {
        System.out.println("getLn");
        userInfo instance = null;
        String expResult = "";
        String result = instance.getLn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class userInfo.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        userInfo instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class userInfo.
     */
    public void testGetDesc() {
        System.out.println("getDesc");
        userInfo instance = null;
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
