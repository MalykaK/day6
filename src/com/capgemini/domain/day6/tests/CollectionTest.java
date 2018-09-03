package com.capgemini.domain.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.day6.Car;
import com.capgemini.domain.day6.CellPhone;
import com.capgemini.domain.day6.Laptop;
import com.capgemini.domain.day6.School;
import com.capgemini.domain.day6.Television;

class CollectionTest {

	/*@Test
	void CarTest() {
		HashSet<Car> car=new HashSet<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,300000)));
		assertEquals(true, car.add(new Car("bmw","x5",2006,1000000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2009,700000)));
		//Car.printAll(car);
		System.out.println(car);
	}
	/*@Test
	void TelevisionTest() {
		//ArrayList<Television> tv=new ArrayList<Television>();
		 HashSet<Television> tv=new Hashset<Television>();
		assertEquals(true, tv.add(new Television("LG","LED",true,30000)));
		assertEquals(true, tv.add(new Television("Sony","LCD",false,54000)));
		assertEquals(true, tv.add(new Television("Onida","Plasma",true,35000)));
		System.out.println(tv);
		//Television.printAll(tv);
	}
	/*@Test
	void CellPhoneTest() {
		HashSet<CellPhone> cell=new Hashset<CellPhone>();
		assertEquals(true, cell.add(new CellPhone("samsung","j7max","best","Android",17000)));
		assertEquals(true, cell.add(new CellPhone("oneplus","6","good","Android",50000)));
		assertEquals(true, cell.add(new CellPhone("apple","i6","good","IOS",30000)));
		System.out.println(cell);

}*/
	/*@Test
	void LaptopTest(){
		HashSet<Laptop> laptop=new HashSet<Laptop>();
		assertEquals(true, laptop.add(new Laptop("asus","N70UF","Windows","Intelcore7")));
		assertEquals(true, laptop.add(new Laptop("dell","B60UH","Windows8","Intelcore3")));
		assertEquals(true, laptop.add(new Laptop("lenovo","C09UF","Windows10","Intelcore5")));
		//Laptop.printAll(laptop);
		System.out.println(laptop);
	}*/
	@Test
	void SchoolTest() {
		HashSet<School> school=new HashSet<School>();
		assertEquals(true, school.add(new School("sam","Hyderabad","JGS","Rangareddy",1)));
		assertEquals(true, school.add(new School("Geetha","Bangalore","GMS","bg",5)));
		assertEquals(true, school.add(new School("NMS","Hyderabad","NMS","Hyderabad", 3)));
		//School.printAll(school);
		System.out.println(school);
	}
}
