package com.cogzy.programs;

public class P01_CreateArray {

	public static void main(String[] args) {

		int[] x;

		int size = 4;
		x = new int[size];

		System.out.println("x is:" + x);
		System.out.println("Elements of x are");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		x[0] = 78;
		x[1] = 88;
		x[2] = 28;
		x[3] = 98;
		//x[4] = 18;

		System.out.println("New elements of x are");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		x = new int[] { 67, 78, 89, 56, 89 };
		x[2] = 20;

		System.out.println("New elements of x are:");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
