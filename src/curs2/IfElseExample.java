package curs2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu username: ");
		inputUsername = inputUsername.substring(0,1).toUpperCase() + inputUsername.substring(1).toLowerCase();
        String inputUsername = scan.next();
        System.out.println("Te rog introdu password: ");
        int inputPassword = scan.nextInt();
        
        
        //Stringurile se verifica cu metoda equals nu cu ==
        // && -- AND
        // || -- OR
        //bolean - true sau false
        
        if(username.equals(inputUsername) && password == inputPassword ) {
        	System.out.println("login succesful");
	    }else {
		    System.out.println("username or password is wrong");
	}

	}
	}
