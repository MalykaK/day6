package com.capgemini.domain.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private boolean threeDEnabled;
	private int price;

	@Override
	public int hashCode() {
		return Objects.hash(company, type, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Television c1 = (Television) obj;
		return this.company == c1.company && this.type == c1.type && this.price == c1.price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isThreeDEnabled() {
		return threeDEnabled;
	}

	public void setThreeDEnabled(boolean threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Television(String company, String type, boolean threeDEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	/*public static void printAll(ArrayList<Television> tv) {
		for (Television television : tv) {
			System.out.println("company: " + television.company);
			System.out.println("type: " + television.type);
			System.out.println("threeDEnable: " + television.threeDEnabled);
			System.out.println("Price: " + television.price);

		}*/
		// TODO Auto-generated method stub

	}

