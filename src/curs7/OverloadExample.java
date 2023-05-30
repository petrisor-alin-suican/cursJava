package curs7;

public class OverloadExample {

	public static void main(String[] args) {
		
		System.out.println(multiplyDouble(2, 3.5));
		
		System.out.println('c');
		System.out.println("text");
		System.out.println(1);

	}
	
	public static int multiply(int a, int b) {
			return a * b;
	}
	
	public static double multiplyDouble(double a, double b) {
		return a * b;
	}

}
