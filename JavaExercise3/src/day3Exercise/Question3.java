package day3Exercise;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number between 1 nad 7: ");

		int num1 = input.nextInt();

		switch (num1) {
		case 1:
			System.out.println("You entered 1 for Monday");
			break;
		case 2:
			System.out.println("You entered 2 for Tuesday");
			break;
		case 3:
			System.out.println("You entered 3 for Wednesday");
			break;
		case 4:
			System.out.println("You entered 4 for Thursday");
			break;
		case 5:
			System.out.println("You entered 5 for Friday");
			break;
		case 6:
			System.out.println("You entered 6 for Saturday");
			break;
		case 7:
			System.out.println("You entered 7 for Sunday");
			break;
		}
		
		
		if (num1 > 0 && num1 < 6) {
			System.out.println("It is Weekday");
		} else if (num1 >= 1 && num1 <= 7){
			System.out.println("It is Weekend");
		}
		else {
			System.out.println("Invalid date");
		}
		
		input.close();
	}

}
