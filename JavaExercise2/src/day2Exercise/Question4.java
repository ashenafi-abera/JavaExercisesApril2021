package day2Exercise;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Your Age: ");
		int num = input.nextInt();
		
		if (num >= 18) {
			System.out.println("You are " + num + " years old and you are eligible to vote: ");
		}
		else {
			System.out.println("You must be order than or equal to 18 years old to vote: ");
		}
		
		input.close();
	}

}
