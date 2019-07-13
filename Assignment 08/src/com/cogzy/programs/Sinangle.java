package com.cogzy.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sinangle {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the value of sin");
		int sin = Integer.parseInt(reader.readLine());

		double radians = sin * Math.PI / 180;
		System.out.println(radians);

	}

}
