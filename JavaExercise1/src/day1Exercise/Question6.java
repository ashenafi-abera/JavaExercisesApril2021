package day1Exercise;

/*Write a Java program to compute the specified expressions and print the
output. 
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))*/

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double num1 = (25.5 * 3.5 -3.5 *3.5);
		double num2 = 40.5;
		double num3 = 4.5;
		
		double compute = num1/(num2 - num3);
		
		System.out.println("The result of num1, num2 and num3 is = " + compute);
	

	}

}
