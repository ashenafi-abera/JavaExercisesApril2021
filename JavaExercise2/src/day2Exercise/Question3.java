package day2Exercise;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner check = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = check.nextInt();
		
		if (num > 0) {
			System.out.println("You Entered Positive Number: " + num);
		}
		else {
			System.out.println("You Entered Negative Number: " + num);
		}
		
		check.close();
	}

}
