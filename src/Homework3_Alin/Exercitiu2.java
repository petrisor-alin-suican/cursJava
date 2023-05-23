package Homework3_Alin;

public class Exercitiu2 {

	public static void main(String[] args) {
		
		int comision;
		int vanzari =3500;
		
		/*comision = (vanzari>2500)?vanzari*5/100:0;
		
		System.out.println("Comisionul tau este: " + comision);*/
		
		
		if(vanzari>2500) {
			comision = vanzari*5/100;
			System.out.println("Comisionul tau este: " + comision);
		}else {
			System.out.println("Comisionul tau este 0");
		}

	}

}
