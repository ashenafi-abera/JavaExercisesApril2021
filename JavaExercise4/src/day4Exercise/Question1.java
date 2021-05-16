package day4Exercise;

/*Write a Java program to calculate the average value of array integers.*/

public class Question1 {

	public static void main(String[] args) {
		
		int[] myArray = {11, 16, 9, 14, 25};
		
		int sum = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			
			sum = sum + myArray[i];
			
		}
		
		int average = sum/myArray.length;
		
		System.out.println("The average of an array elements is: " + average);

	}

}
