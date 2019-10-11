package com.cphbusiness.carrentalwulf;
import Util.IdFactory;

import java.util.ArrayList;

public class Garage {
	String id;
	ArrayList<Car> garageCars;

	public Garage() {
		id = IdFactory.getGarageId();
		garageCars = new ArrayList<>();
	}

	public boolean addCar(Car c) {
		boolean retVal; 
		retVal = garageCars.add(c);
		return retVal;
	}

	public String gargeToHtml() {
		String retValHtml = "<html><ul>";
		for (Car c : garageCars) {
			retValHtml += "<li>"+ c.getMake()+ "</li>";
		}
		retValHtml += "</ul></html>";
		return  retValHtml;
	}
	
}
