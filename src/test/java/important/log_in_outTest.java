package important;

import junit.framework.TestCase;

public class log_in_outTest extends TestCase {
    
    public log_in_outTest(String testName) {
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
     * Test of validate method, of class log_in_out.
     */
    public void testValidate() {
        System.out.println("validate");
        log_in_out instance = new log_in_out();
        String expResult = "";
        String result = instance.validate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class log_in_out.
     */
    public void testLogout() {
        System.out.println("logout");
        log_in_out instance = new log_in_out();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo method, of class log_in_out.
     */
    public void testSetInfo() {
        System.out.println("setInfo");
        String user_type = "";
        log_in_out instance = new log_in_out();
        instance.setInfo(user_type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionName method, of class log_in_out.
     */
    public void testGetSessionName() {
        System.out.println("getSessionName");
        log_in_out instance = new log_in_out();
        String expResult = "";
        String result = instance.getSessionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserID method, of class log_in_out.
     */
    public void testGetUserID() {
        System.out.println("getUserID");
        log_in_out instance = new log_in_out();
        int expResult = 0;
        int result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
