package curs3;

import java.util.Scanner;

public class ParSauImpar {
	
	int number;  //variabila globala = poate fi folosita in orice metoda din clasa;   //cea locala doar in metoda respectiva
	
	public void askTheUserForAnNumber() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
	}
	
	
	public void checkNumberIsOddOrEven() {
		
		askTheUserForAnNumber();  //metoda de mai sus poate fi chemata in a2a metoda
		
		if( number % 2 == 0) {
			System.out.println(number + " : is even!");
			
		}else {
			System.out.println(number + " : is odd!");
		}
		
		//askTheUserForAnNumber();  executa checkNumberIsOddOrEven si afiseaaza even pentru ca impartirea lui 0 la 2 e 0;
		
	}

}
