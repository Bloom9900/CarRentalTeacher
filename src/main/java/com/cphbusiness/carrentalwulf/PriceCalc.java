/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.carrentalwulf;

/**
 *
 * @author thor
 */
public class PriceCalc {
	Car car;
	Customer cust;

	public PriceCalc() {

	}
	public PriceCalc(Car car, Customer cust) {
		this.car = car;
		this.cust = cust;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public double getPrice() {
		//return 234.4;
		return 250.5;
		
	}

	
	
}
