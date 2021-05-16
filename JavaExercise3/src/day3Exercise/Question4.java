package day3Exercise;

/*Write a program that takes a positive integer input and prints all the 
positive even number less than the number in order from big to small.
(Use do while loop)*/

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please a positive integer: ");

		int num1 = input.nextInt();
		
		int x = num1;

		if (x % 2 == 0) {
			x -= 2;

		} else if (x % 2 == 1) {
			x = num1 - 1;
		}

		do {
			System.out.println(x);
			x -= 2;

		} while (x > 0);

		input.close();
	}

}
