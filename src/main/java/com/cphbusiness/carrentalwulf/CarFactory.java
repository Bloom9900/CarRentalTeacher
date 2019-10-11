package com.cphbusiness.carrentalwulf;

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CarFactory {
	public HashMap<String, Car> myCars;

	public CarFactory() {
		myCars = new HashMap<>();
	}

	public HashMap<String, Car> createCarsFromFile(String filename) throws FileNotFoundException {
		// public Car(String make, String model, String type, int length, int weight)
		// Audi;A4 1.8T 4dr;4;170;22;31;3252;104
		

		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		while(myScanner.hasNextLine()){
			String line =  myScanner.nextLine();
			System.out.println(line);
		}
		return myCars;
	}
	
}
