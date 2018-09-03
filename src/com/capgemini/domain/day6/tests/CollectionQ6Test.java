package com.capgemini.domain.day6.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CollectionQ6Test {

	@Test
	void testStudentFavouriteFruit() {
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		String[] favorites = new String[] {"fasgh","asdyau"};
		map.put("Malyka", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("Varuni", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","cockroach"};
		map.put("Ganga", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","papaya","apple"};
		map.put("Poudel", new ArrayList<>(Arrays.asList(favorites)));
		
		assertEquals(4, map.size());
		for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
	}
}