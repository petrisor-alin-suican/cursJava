package Homework5_Alin;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introduc vechimea: ");
		int vechime = scan.nextInt();
		
		
		switch(vechime) {
		case 1:
			System.out.println("Bonusul este de 100");
			break;
		case 2:
			System.out.println("Bonusul este de 200!");
			break;
		case 3:
			System.out.println("Introdu valoarea vanzarilor: ");
			int valoareVanzari = scan.nextInt();
			
			System.out.println("Introdu luna in care s-au efectuat vanzarile: ");
			int lunaVanzari = scan.nextInt();
			
			if(valoareVanzari<=5000) {
				System.out.println("Bonusul este de 600");
			}else {
				if(valoareVanzari<=10000) {
					switch(lunaVanzari) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
						System.out.println("Bonusul este de 800");
						break;
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
						System.out.println("Bonusul este de 1000");
						break;
					case 12:
						System.out.println("Bonusul este de 900! In decembrie se vand singure");
						break;
						default:
							System.out.println("Introdu o luna valida: ");
						
					}
				} else {
					System.out.println("Bonusul este de 1000");
				}
			}
		}
		
		
		
	}

}
