package com.cphbusiness.carrentalwulf;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class GarageTest {
	Garage myGarage;
	ArrayList<Car> myCars;
	Car myCar;

	
	public GarageTest() {
	}
	
	@Before
	public void setUp() {
		myCars = new ArrayList<>();
		myGarage = new Garage();
			//public Car(String make, String model, String type, int length, int weight) {

		myCar = new Car("Audi","A4","1.8T",22,3252);

	}

	/**
	 * Test of addCar method, of class Garage.
	 */
	@Test
	public void testAddCar() {
		boolean expected = true;
		boolean actual = myGarage.addCar(myCar);
		assertTrue(actual==expected);
	}

	/**
	 * Test of gargeToHtml method, of class Garage.
	 */
	@Test
	public void testGargeToHtml() {
		myGarage.addCar(myCar);
		String actual = myGarage.gargeToHtml();
		String expected ="Kurt";
		assertNotEquals(actual, expected);

	}
	
}
