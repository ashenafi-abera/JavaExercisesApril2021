package day4Exercise;

/*Write a Java program to find the index of an array element. 
*/
public class Question3 {

	public static void main(String[] args) {

		int[] testArrayValue = { 6, 5, 18, 20, 35 };

		int givenValue = 5;
		int index = -1;

		for (int i = 0; i < testArrayValue.length; i++) {
			if (testArrayValue[i] == givenValue) {
				index = i;
			}

		}
		if (index == -1) {
			System.out.println("No Index for the giving element");
		} else {
			System.out.println("The index of " + givenValue + " " + "is: " + index);
		}

	}

}
