package day2Exercise;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		
		System.out.println("The Sum of num1 and num2 is = " + sum);
		System.out.println("The Difference of num1 and num2 is = " + difference);
		
		input.close();
	}

}
