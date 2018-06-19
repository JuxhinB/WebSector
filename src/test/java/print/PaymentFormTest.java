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
public class PaymentFormTest extends TestCase {
    
    public PaymentFormTest(String testName) {
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
     * Test of paymentForm method, of class PaymentForm.
     */
    public void testPaymentForm() {
        System.out.println("paymentForm");
        PaymentForm instance = new PaymentForm();
        instance.paymentForm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paymentSubmit method, of class PaymentForm.
     */
    public void testPaymentSubmit() {
        System.out.println("paymentSubmit");
        PaymentForm instance = new PaymentForm();
        instance.paymentSubmit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
