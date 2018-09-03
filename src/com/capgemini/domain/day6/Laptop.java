package com.capgemini.domain.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop {
	
private String company;
private String model;
private String operatingSystem;
private String processor;
	
@Override
public int hashCode() {
	return Objects.hash(company, model, operatingSystem);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;

	Laptop c1 = (Laptop) obj;
	return this.company == c1.company && this.model == c1.model && this.operatingSystem == c1.operatingSystem;
}

@Override
public String toString() {
	return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem + ", processor="
			+ processor + "]";
}

public Laptop(String company, String model, String operatingSystem, String processor) {
	this.company = company;
	this.model = model;
	this.operatingSystem = operatingSystem;
	this.processor = processor;
	}
public static void printAll(ArrayList<Laptop> laptop) {
	for (Laptop laptop2 : laptop) {
		System.out.println("Company: "+laptop2.company);
		System.out.println("model: "+laptop2.model);
		System.out.println("operatingSystem: "+laptop2.operatingSystem);
		System.out.println("processor: "+laptop2.processor);
	}
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
}
