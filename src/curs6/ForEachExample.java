package curs6;

import java.util.Arrays;

public class ForEachExample {

	public static void main(String[] args) {

		String [] orase = {"Iasi", "Brasov", "Pitesti", "Ploiesti", "Cluj"};
//System.out.println(orase[1]);
		
		for(int i = 0; i<orase.length; i++) {
			System.out.println(orase[i]);
		}
		System.out.println("--------------------");
		
		for(String element : orase) {
			System.out.println(element);
			
			
		}
		
		System.out.println("------------");
		
		System.out.println(orase);
		System.out.println(Arrays.toString(orase));
		
	}

}
