package com.cogzy.programs;

import com.cogzy.utils.DoublyLinkedList;

public class P02_LinkedListDemo {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> nums = new DoublyLinkedList<Integer>();

		nums.addAtStart(20);
		System.out.println(nums);
		nums.addAtStart(50);
		System.out.println(nums);
		nums.addAtStart(35);
		System.out.println(nums);
		nums.addAtEnd(70);
		System.out.println(nums);

		 nums.deleteStart();
		 System.out.println(nums);

		 nums.deleteEnd();
		 System.out.println(nums);

		int index = 2;
		nums.addAtIndex(900, index);
		System.out.printf("Element at index %d is %s\n", index, nums);

		index = 2;
		nums.deleteAtIndex(index);
		System.out.printf("Element at index %d is deleted %s \n", index, nums);

		index = 1;
		nums.set(99, 1);
		System.out.printf("After setting 99 at index %d, nums is %s\n", index, nums);

		Integer n = 35;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);

		n = 99;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);
         
		
		n = 20;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);

		n = 70;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);
		
	    index = 2;
		 n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n);
	    

		 index = 3;
		 n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n);
	    

	}
}
