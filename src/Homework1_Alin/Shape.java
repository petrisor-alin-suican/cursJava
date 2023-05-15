package Homework1_Alin;

public class Shape {
	
	
	//metoda 1
		public int calculateSquareArea(int lenght) {
			return lenght * lenght;
		}
		
	//metoda 2
		public int calculateRectangleArea(int lenght, int width) {
			return lenght * width;
		}
		
	
		
	//constructor 1
	public Shape(int lenght) {
		System.out.println("The area of the square is" + " : " + calculateSquareArea(lenght));
	}

	
	
	//constructor 2
	public Shape(int lenght, int width) {
		System.out.println("The are of the rectangle is" + " : " + calculateRectangleArea(lenght, width));
	}
	
	
	
	//constructor 3
	public Shape(double radius) {
		System.out.println("The are of the circle is : " + radius*radius*Math.PI);
		
	}
}
