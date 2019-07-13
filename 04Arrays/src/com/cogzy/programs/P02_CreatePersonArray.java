package com.cogzy.programs;

import com.cogzy.model.Person;

public class P02_CreatePersonArray {

	public static void main(String[] args) {

		Person[] people;

		people = new Person[5];
		people[0] = new Person("Theju", 180, 50);
		people[1] = new Person("Ranju", 160, 55);
		people[4] = new Person();

	//	for (int i = 0; i < people.length; i++) {
		//	Person p = people[i];
			//System.out.println("p is" + p);
	//	}

		for (Person p : people) {
			System.out.println("p is : " + p);
		}
	}
}
