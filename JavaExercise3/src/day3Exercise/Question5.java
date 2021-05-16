package day3Exercise;

/*Use while loop and create a program that calculates the average of the
numbers between x and y. x and y are the integers the user has to 
input.*/

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for X: ");
		int num1 = input.nextInt();
		System.out.print("Enter a number for Y: ");
		int num2 = input.nextInt();
		
		int counter = 0;
		int sum = 0;
		while (counter == 0 ) {

			sum = num1 + num2;
			counter++;
		}

		int avg = sum / 2;
		System.out.println("The average of  X and Y is = " + avg);

		input.close();

		

	}

}
