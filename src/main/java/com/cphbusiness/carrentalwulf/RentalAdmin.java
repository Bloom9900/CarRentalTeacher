package com.cphbusiness.carrentalwulf;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class RentalAdmin extends Employee{

	public RentalAdmin(String name) {
		super(name);
	}

	public boolean createCarsFromFile(String filename) throws FileNotFoundException {
		CarFactory myCarFactory = new CarFactory();
		HashMap<String, Car> myImpCars = myCarFactory.createCarsFromFile(filename);
		boolean retVal = true;
		return retVal;
	}

	
}
