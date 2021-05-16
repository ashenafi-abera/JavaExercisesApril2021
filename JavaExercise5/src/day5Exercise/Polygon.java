package day5Exercise;

//Question1
/*Write a java program that has a Polygon class with a property Sides 
and color. In the main class create 3 objects triangle, rectangle and 
polygon.

Question2
Modify your code from question 1 by adding a constructor for the 
Polygon class and user should pass the values for Sides and color 
during the initialization.

Question3
Modify your code from question 1 by adding two methods to display 
the number of sides and color of the polygon object created. In the 
main class call the methods for every object you have created.

*/
//SuperClass
public class Polygon {

	// Attribute - Properties
	private int side;
	private String color;

	//Constructor
	public Polygon(int side, String color) {

		this.side = side;
		this.color = color;
	}

	//Methods
	public void printSide() {
		System.out.println(side);
	}
	public void printColor() {
		System.out.println(color);
	}
	


}



