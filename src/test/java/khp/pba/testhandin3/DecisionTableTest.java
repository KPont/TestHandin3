/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khp.pba.testhandin3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class DecisionTableTest {
    
    public DecisionTableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Reimbursement method, of class DecisionTable.
     */
    @Test
    public void testReimbursementFD() {
        System.out.println("Reimbursement: deduct: false, visit: D");
        boolean deduct = false;
        String visit = "D";
        DecisionTable instance = new DecisionTable();
        double expResult = 0.0;
        double result = instance.Reimbursement(deduct, visit);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testReimbursementFH() {
        System.out.println("Reimbursement: deduct: false, visit: H");
        boolean deduct = false;
        String visit = "H";
        DecisionTable instance = new DecisionTable();
        double expResult = 0.0;
        double result = instance.Reimbursement(deduct, visit);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testReimbursementTD() {
        System.out.println("Reimbursement: deduct: true, visit: D");
        boolean deduct = true;
        String visit = "D";
        DecisionTable instance = new DecisionTable();
        double expResult = 0.5;
        double result = instance.Reimbursement(deduct, visit);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testReimbursementTH() {
        System.out.println("Reimbursement: deduct: true, visit: H");
        boolean deduct = true;
        String visit = "H";
        DecisionTable instance = new DecisionTable();
        double expResult = 0.8;
        double result = instance.Reimbursement(deduct, visit);
        assertEquals(expResult, result, 0.0);
    }
    
}
