package curs3;

public class StaticVsNonStatic {
	
	//variabila statica(variabila de clasa = nu e asociata cu instanta clasei in care sa afla)
	public static String nume;
	
	
	//variabila de instanta = poate fi folosita in afara clasei, doar avand o instanta(obiect) al clasei respective
	public String prenume;
	
	//metoda statica
	public static void printStatic() {
	    System.out.println("Static");
	}
	
	//metoda de instanta
	public void printNormal() {
		System.out.println("Print normal");
	}

}
