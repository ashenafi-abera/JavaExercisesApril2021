package day2Exercise;

import java.util.InputMismatchException;

/*Write a Java program to get a number from the user and print whether 
it is positive or negative*/

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner check = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		try {
		int num = check.nextInt();
		
		
		if (num > 0) {
			System.out.println("You Entered Positive Number: " + num);
		}
		else {
			System.out.println("You Entered Negative Number: " + num);
		}
		}catch(InputMismatchException e) {
			System.out.println("You entred a mismatch value");
		}
		
		check.close();
	}

}
