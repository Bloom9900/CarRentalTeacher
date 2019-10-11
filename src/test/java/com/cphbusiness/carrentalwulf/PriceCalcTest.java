package com.cphbusiness.carrentalwulf;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PriceCalcTest {
	
	Car ca;
	Customer cu;
	PriceCalc myPC;
	
	public PriceCalcTest() {
	}
	
	@Before
	public void setUp() {
		ca = new Car("Audi","A4","1.8T",22,3252);
		cu = new Customer();
		myPC = new PriceCalc(ca,cu);
	}
	
	/**
	 * Test of getCar method, of class PriceCalc.
	 */
	@Test
	public void testGetPrice() {
		double myPrice = this.myPC.getPrice();
		double expected = 250.50;
		assertEquals(expected, myPrice, 0.0001);
	}
}
