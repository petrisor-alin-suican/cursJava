package Homework4_Alin;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		String user = "TestUser";
		int parola = 1234;
		int incercari = 0;
		String username = "";
		int password = 0;
		
		
		
		
		do {
			System.out.println("Enter user: ");
			username = scan.next();
			System.out.println("Enter password: ");
			password = scan.nextInt();
			
			if(user.equals(username)&&parola==password) {
				System.out.println("Login successfull");
				break;
			}else {
				System.out.println("Login error");
				incercari++;
			}
			
		}while(incercari < 3);
		
		
		if(incercari == 3) {
			System.out.println("Maximum attempts reached. User blocked");		}
			
		scan.close();
	}

}
