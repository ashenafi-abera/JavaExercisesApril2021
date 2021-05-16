package day3Exercise;

/*Write a java program to calculate the sum of first 10 integers. The 
program should calculate the sum using for loop.
Sum : 55*/

public class Question1 {

	public static void main(String[] args) {
		
	
		int sum = 0;
		//Initializing Testing Condition Incr/dec
		for(int i = 0; i <= 10; i++ ) {
				
			sum = sum + i;
			
		}
		
		System.out.println(sum);	
		
}
}
