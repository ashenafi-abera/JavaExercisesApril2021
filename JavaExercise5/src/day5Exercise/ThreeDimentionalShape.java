package day5Exercise;

/*Create a ThreeDimentionalShape class inheriting from Polygon class. 
Add height property, create a constructor with Sides , color and 
Height.Add a method to display the height.*/

//SubClass
class ThreeDimentionalShape extends Polygon {

	private int height;
	
	//Constructor with Sides , color and Height
	 public ThreeDimentionalShape(int side, String color, int height) {
		super(side, color);
		this.height = height;
	}
	 
	 //Method
	public void printHeight() {
			System.out.println(height);
		}

}
