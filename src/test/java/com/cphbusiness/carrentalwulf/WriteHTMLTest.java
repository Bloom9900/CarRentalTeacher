/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.carrentalwulf;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class WriteHTMLTest {
	WriteHTML myWriteHTML;
	Garage myGarage;
	Car myCar;
	Car myCar2;
	
	public WriteHTMLTest() {
	}
	
	@Before
	public void setUp() {
		myWriteHTML = new WriteHTML();
		myGarage = new Garage();
		myCar = new Car("Audi","A4","1.8T",22,3252);
		myCar2 = new Car("BMW","320i","1.8T",24,2252);
		myGarage.addCar(myCar);
		myGarage.addCar(myCar2);
	}

	@Test
	public void testWriter() throws IOException {
		myWriteHTML.deployData(myGarage);
	}
	
}
