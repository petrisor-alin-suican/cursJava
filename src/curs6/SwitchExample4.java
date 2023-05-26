package curs6;

import java.util.Scanner;

public class SwitchExample4 {
	
	/*Facem un program care verifica daca un student este eligibil de bursa
	 * conditiile sunt:
	 * sa fie anul 3
	 * sa aiba un punctaj de 80 pentru bursa1 
	 * sa aiba un punctaj de 50 pentru bursa2
	 */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Ce an esti? ");
        int an = scan.nextInt();
        //System.out.println("Care este punctajul tau? ");
        int punctaj; // = scan.nextInt();
        
        switch(an) {
        case 3:
        	System.out.println("Care este punctajul tau? ");
            punctaj = scan.nextInt();
        	switch(punctaj) {
        	case 80:
        		System.out.println("Esti eligibil pentru bursa1");
        		break;
        	case 50:
        		System.out.println("Esti eligibil pentru bursa2");
        		break;
        	default: 
        		System.out.println("Nu esti eligibil");
        	}
        	break;
        	default:
        		System.out.println("Nu esti eligibil");
        }
        
	}

}
