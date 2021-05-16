package day1Exercise;

/*Write a Java program to print the area and perimeter of a circle. 
Test 
Data:
Hint: Use 
Math.PI
Radius = 7.5*/

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 7.5;
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

	}

}
