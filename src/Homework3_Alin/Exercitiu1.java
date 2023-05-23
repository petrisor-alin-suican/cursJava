package Homework3_Alin;

import java.util.Scanner;


public class Exercitiu1 {

	public static void main(String[] args) {
		
		
		int factura;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Care este pretul facturii? ");
		factura = scan.nextInt();
		scan.close();
		int discount = (factura>=100)?10:5;
		System.out.println("Pretul discountului este " + discount);

	}

}
