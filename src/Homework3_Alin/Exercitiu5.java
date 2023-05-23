package Homework3_Alin;

import java.util.Scanner;

public class Exercitiu5 {

	public static void main(String[] args) {

		tablaInmultirii();
		
	}
		
	public static void tablaInmultirii() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numar = scan.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println("Rezultatul inmultirii lui " + numar + " cu " + i + " este " + numar*i);
		} 
		scan.close();
	}
		
		
}
