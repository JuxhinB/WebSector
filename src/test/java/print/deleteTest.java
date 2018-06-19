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
public class deleteTest extends TestCase {
    
    public deleteTest(String testName) {
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
     * Test of dropItem method, of class delete.
     */
    public void testDropItem() throws Exception {
        System.out.println("dropItem");
        delete instance = new delete();
        instance.dropItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo method, of class delete.
     */
    public void testSetInfo() throws Exception {
        System.out.println("setInfo");
        String table = "";
        delete instance = new delete();
        instance.setInfo(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
