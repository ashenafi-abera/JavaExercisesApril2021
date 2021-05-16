package day5Exercise;

/*In the main class create a rectangular 3D object and call all the 
methods to display all the properties.
*/
public class Main {

	public static void main(String[] args) {
		Polygon triangle = new Polygon(3, "White");
		triangle.printSide();
		triangle.printColor();
		Polygon rectangle = new Polygon(4, "Yellow");
		rectangle.printSide();
		rectangle.printColor();
		Polygon polygon = new Polygon(10, "Blue");
		polygon.printSide();
		polygon.printColor();
		
		System.out.println();
		
		ThreeDimentionalShape rectangular3D = new ThreeDimentionalShape(5, "Orange", 20);
		rectangular3D.printSide();
		rectangular3D.printColor();
		rectangular3D.printHeight();
		
	}

}

