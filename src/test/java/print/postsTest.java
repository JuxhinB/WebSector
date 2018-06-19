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
public class postsTest extends TestCase {
    
    public postsTest(String testName) {
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
     * Test of latestPosts method, of class posts.
     */
    public void testLatestPosts() throws Exception {
        System.out.println("latestPosts");
        posts instance = new posts();
        ArrayList expResult = null;
        ArrayList result = instance.latestPosts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gallery method, of class posts.
     */
    public void testGallery() throws Exception {
        System.out.println("gallery");
        posts instance = new posts();
        ArrayList expResult = null;
        ArrayList result = instance.gallery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productDisplay method, of class posts.
     */
    public void testProductDisplay() throws Exception {
        System.out.println("productDisplay");
        posts instance = new posts();
        ArrayList expResult = null;
        ArrayList result = instance.productDisplay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
