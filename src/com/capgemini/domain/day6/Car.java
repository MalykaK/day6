package com.capgemini.domain.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
private String make;
private String model;
private int year;
private int price;

@Override
public int hashCode() {
	return Objects.hash(make,model,year);
}
@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	
	Car c1 = (Car) obj;
	return  this.make == c1.make
				&& this.model == c1.model && this.year== c1.year;
}

public Car(String make, String model, int year, int price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
}
public static void printAll(ArrayList<Car> car) {
	for (Car car2 : car) {
		System.out.println("Make: "+car2.make);
		System.out.println("Model: "+car2.model);
		System.out.println("Year: "+car2.year);
		System.out.println("Price: "+car2.price);
	}
	// TODO Auto-generated method stub
	
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}