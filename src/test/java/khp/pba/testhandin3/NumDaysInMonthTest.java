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
public class NumDaysInMonthTest {
    
    public NumDaysInMonthTest() {
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

    @Test
    public void testFeb2017NonLeap() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(28, instance.getNumDaysinMonth(2, 2017));
    }
    @Test
    public void testFeb2016Leap() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(29, instance.getNumDaysinMonth(2, 2016));
    }
    @Test
    public void testJan2017() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(31, instance.getNumDaysinMonth(1, 2017));
    }
    @Test
    public void testJan2016() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(31, instance.getNumDaysinMonth(1, 2016));
    }
    @Test
    public void testApril2017() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(30, instance.getNumDaysinMonth(4, 2017));
    }
    @Test
    public void testApril2016() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(30, instance.getNumDaysinMonth(4, 2016));
    }
    @Test
    public void testJan0000() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(31, instance.getNumDaysinMonth(1, 0));
    }
    @Test
    public void testJanInvalidYearLow() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(0, instance.getNumDaysinMonth(1, -1));
    }
    @Test
    public void testInvalidMonthLow2017() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(0, instance.getNumDaysinMonth(-1, 2017));
    }
    @Test
    public void testInvalidMonthHigh2017() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(0, instance.getNumDaysinMonth(13, 2017));
    }
    @Test
    public void testFeb1900NonLeap() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(28, instance.getNumDaysinMonth(2, 1900));
    }
    @Test
    public void testFeb2000Leap() {
         NumDaysInMonth instance = new NumDaysInMonth();
         assertEquals(29, instance.getNumDaysinMonth(2, 2000));
    }
    
    
}
