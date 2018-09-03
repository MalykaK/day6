package com.capgemini.domain.day6;

import java.util.ArrayList;
import java.util.Objects;

public class School {
private String name;
private String  city;
private String school;
private String district;
private int greatSchoolRanking;
@Override
public int hashCode() {
	return Objects.hash(name, city, school);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;

	School c1 = (School) obj;
	return this.name == c1.name && this.city == c1.city && this.school == c1.school;
}

public School(String name, String city,String school,String district, int greatSchoolRanking) {
	//super();
	this.name = name;
	this.city = city;
	this.school = school;
	this.district= district;
	this.greatSchoolRanking = greatSchoolRanking;
}

public static void printAll(ArrayList<School> school2) {
	for (School school : school2) {
		
	
	System.out.println("Name: "+school.name);
	System.out.println("City: "+school.city);
	System.out.println("School: "+school.school);
	System.out.println("District: "+school.district);
	System.out.println("GreatSchoolRanking: "+school.greatSchoolRanking);
}
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school = school;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public int getGreatSchoolRanking() {
	return greatSchoolRanking;
}

public void setGreatSchoolRanking(int greatSchoolRanking) {
	this.greatSchoolRanking = greatSchoolRanking;
}
}