package com.capgemini.domain.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		CellPhone c1 = (CellPhone) obj;
		
		return  this.company == c1.company 
					&& this.model == c1.model && this.operatingSystem == c1.operatingSystem;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public CellPhone(String company, String model, String description, String operatingSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}
	

/*public static void printAll(ArrayList<CellPhone> cell) {
		for (CellPhone cellPhone : cell) {
			System.out.println("Company: "+cellPhone.company);
			System.out.println("Model: "+cellPhone.model);
			System.out.println("Description: "+cellPhone.description);
			System.out.println("OperatingSystem: "+cellPhone.operatingSystem);
			System.out.println("Price: "+cellPhone.price);
			
			
		}*/
	
}

