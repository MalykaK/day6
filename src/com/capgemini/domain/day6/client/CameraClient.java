package com.capgemini.domain.day6.client;

import java.util.HashSet;

import com.capgemini.domain.day6.Camera;

public class CameraClient {
	public static void main(String[] args) {
		
		HashSet<Camera> products=new HashSet<>();
		products.add(new Camera("NK234"35000,"NIKON"));
		products.add(new Camera("NK235"45000,"CANNON"));
		products.add(new Camera("NK236"25000,"NIKON"));
		for(Camera c : products)
		{
			System.out.println(c);
		}
	}

}
