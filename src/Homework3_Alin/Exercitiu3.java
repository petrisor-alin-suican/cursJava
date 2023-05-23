package Homework3_Alin;

import java.util.Scanner;


public class Exercitiu3 {

	public static void main(String[] args) {

		int punctaj;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu punctaj: ");
		punctaj = scan.nextInt();
		scan.close();
		
		String calificativ = punctaj>=90?"Ai primit : FoarteBine" : punctaj<90 && punctaj>=80?"Ai primit: Bine":"Ai primit: Suficient";
		System.out.println(calificativ);
		
		
	}

}







