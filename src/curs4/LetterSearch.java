package curs4;

import java.util.Scanner;

public class LetterSearch {
	
	/*
	 * Facem un program care cere un text de la tastatura
	 * cautam in text litera a/A
	 * daca o gasim printam ca am gasit litera si  de cate ori exista in text
	 * Daca nu o gasim printam ca nu am gasit litera
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		// masina           masina.charAt(0) == m; 
		// 0m 1a 2s 3i 4n 5a
		System.out.println(text.length());
		
		
		int counter = 0;
		
		
		for(int i=0; i < text.length(); i++ ) {
			
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				counter++;
			}
		}
		
		   String result = counter == 0 ? "Letter was not found" : "Letter a was found " + counter;
		   System.out.println(result);
		   scan.close();
		
	}

}
