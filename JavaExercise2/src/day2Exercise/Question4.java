package day2Exercise;

import java.util.InputMismatchException;

/*Write Java program to allow the user to input his/her age. Then the 
program will show if the person is eligible to vote. A person who is 
eligible to vote must be older than or equal to 18 years old.*/

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Your Age: ");
		try {
		int num = input.nextInt();
		
		if (num >= 18) {
			System.out.println("You are " + num + " years old and you are eligible to vote: ");
		}
		else {
			System.out.println("You must be order than or equal to 18 years old to vote: ");
		}
		}catch(InputMismatchException e) {
			System.out.println("You entered a mismatch value");
		}
		
		input.close();
	}

}
