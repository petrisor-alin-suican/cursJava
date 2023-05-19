package Homework2_Alin;

import java.util.Scanner;

public class Exercitiu1 {
	
	int varsta;
	
	public void askTheAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu varsta persoanei: ");
		varsta = scan.nextInt();
		scan.close();
		
	}

	public void compareTheAge() {
		askTheAge();
		if(0 < varsta && varsta < 18) {
			System.out.println("Esti minor!");
		}
		else if(varsta >= 18 && varsta < 65) {
			System.out.println("Esti adult!");
		}
		else {
			System.out.println("Esti batran!");
		}
	}
}
