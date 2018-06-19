/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important;

import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Juxhin
 */
public class db_connectTest extends TestCase {
    
    public db_connectTest(String testName) {
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
     * Test of getConnected method, of class db_connect.
     */
    public void testGetConnected() throws Exception {
        System.out.println("getConnected");
        db_connect instance = new db_connect();
        instance.getConnected();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class db_connect.
     */
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        db_connect instance = new db_connect();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnection method, of class db_connect.
     */
    public void testSetConnection() {
        System.out.println("setConnection");
        Connection conn = null;
        db_connect instance = new db_connect();
        instance.setConnection(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
