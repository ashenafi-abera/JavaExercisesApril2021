package day4Exercise;

/*Write a Java program to test if an array contains a
specific
value. */

public class Question2 {

	public static void main(String[] args) {

		int[] testArrayValue = { 6, 5, 18, 20, 35 };
		int x = 8;
		boolean check = false;

		for (int i : testArrayValue) {
			if (i == x) {
				check = true;
				break;
			}

		}
		if (check) {
			System.out.println("The given value is found in the array elements");

		} else {
			System.out.println("The given value is not found in the array elements");
		}

	}

}
