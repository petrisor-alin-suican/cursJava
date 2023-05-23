package Homework3_Alin;

import java.util.Scanner;

public class Exercitiu4 {

	public static void main(String[] args) {
		
		int sum=0;
		int nr=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Please enter number" + i + ": ");
			nr=scan.nextInt();
			sum+=nr;
		}
		
	System.out.println("The sum of numbers is " + sum);
	scan.close();
	}

}
