package day2Exercise;

import java.util.InputMismatchException;

/*Write a Java program which reads two integers from the user and 
prints the sum and difference both in their own line. */

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		try {
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the operation: ");
		
	
		char op = input.next().charAt(0);
		
		
		int result = 0;
		
		if (op == '+') {
			result = addion (num1, num2);
		}
		else if (op == '-') {
			result = sub (num1, num2);
		}
		else if (op == '*') {
			result = multi (num1, num2);
		}
		else if (op == '/') {
			result = division (num1, num2);
		}
		else {
			System.out.println("Invalid Operation");
		}
		
		System.out.println("The result of the user input operation is: " + result);
		}catch(InputMismatchException e) {
			System.out.println("You entered a mismatch value");
		}
		
		input.close();
	}
	
	public static int addion(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int multi(int a, int b) {
		return a * b;
	}
	public static int division(int a, int b) {
		return a / b;
	}

}
