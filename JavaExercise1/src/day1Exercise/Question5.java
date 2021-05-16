package day1Exercise;

/*Write a Java program to print the sum (addition), multiply, subtract, 
divide and remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24*/

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 125;
		int num2 = 24;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int division = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("The sum of num1 and num2 is = " + sum);
		System.out.println("The difference of num1 and num2 is = " + sub);
		System.out.println("The multiplication of num1 and num2 is = " + multi);	
		System.out.println("The Division of num1 and num2 is = " + division);
		System.out.println("The mod of num1 and num2 is = " + mod);

	}

}
