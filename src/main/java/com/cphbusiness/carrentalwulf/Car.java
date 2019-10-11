package com.cphbusiness.carrentalwulf;
import Util.IdFactory;
public class Car {
	
	private String regNr;
	private String make;
	private String model;
	private String type;
	private int length;
	private int weight;
	private double kmPrL;
	
	public Car(String make, String model, String type, int length, int weight) {
		this.regNr = IdFactory.getRegNr();
		this.make = make;
		this.model = model;
		this.model = type;
		this.weight = weight;
		this.length = length;
		this.kmPrL = 0;
	}

	public String getRegNr() {
		return regNr;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
	
	
}
