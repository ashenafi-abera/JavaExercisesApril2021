package day4Exercise;

/*Write a Java program to copy an array by iterating the array. */

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {

		//Original Array
		int[] original = { 2, 4, 7, 5, 9 };
		System.out.println("Original Array: " + Arrays.toString(original));
		
		//Copy Array
		int[] copy = Arrays.copyOf(original, 5);
		System.out.println("Copy Array: " + Arrays.toString(copy));
		

	}

}
