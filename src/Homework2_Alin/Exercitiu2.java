package Homework2_Alin;

import java.util.Scanner;

public class Exercitiu2 {
	
	int punctaj;
	
	public void whatIsYourScore() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Add you test score: ");
	punctaj = scan.nextInt();
	scan.close();
	
	}
	
	public void testResult() {
		whatIsYourScore();
		if(punctaj >= 0 && punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca!");
		}
		else {
			System.out.println("Felicitari, ai trecut!");
		}
	}
}
