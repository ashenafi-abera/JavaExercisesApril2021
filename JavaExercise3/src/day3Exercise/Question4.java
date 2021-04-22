package day3Exercise;

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
