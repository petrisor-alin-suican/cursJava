package curs6;

import java.util.Scanner;

public class SwitchExample2 {
	
	/* verificam daca o litera este o consoana sau o vocala
	 *
	 */

	public static void main(String[] args) {

		
		//if(litera == a || litera == e || litera == i ||...)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu o litera: ");
		char litera = scan.next().charAt(0);
		
		//aeiouAEIOU
		
		switch(litera) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Este vocala");
		break;
		default:
		System.out.println("Este consoana");
			
			
		
		}
		
	}

}
