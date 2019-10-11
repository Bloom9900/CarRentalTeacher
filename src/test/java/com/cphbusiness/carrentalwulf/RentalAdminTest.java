
package com.cphbusiness.carrentalwulf;

import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RentalAdminTest {
	RentalAdmin rentalAdmin;
	CarFactory myCarFactory;
	String filename;

	
	public RentalAdminTest() {
	}
	
	@Before
	public void setUp() {
		rentalAdmin = new RentalAdmin("Kurt");
		myCarFactory = new CarFactory();
		filename = "ncars4.csv";
		filename = "C:\\Users\\Jannich\\Documents\\NetBeansProjects\\CarRentalWulf-master\\src\\test\\java\\com\\cphbusiness\\carrentalwulf\\RentalAdminTest.java";

	}

	@Test
	public void testSomeMethod() throws FileNotFoundException {
		boolean found = rentalAdmin.createCarsFromFile(filename);
		boolean expected = true;
		assertTrue(found==expected);
	}
	
}
