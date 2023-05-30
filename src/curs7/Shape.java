package curs7;

public class Shape {

	String nume = "nume generic";
	String culoare = "culoare generica";    //variabila de intanta la niv de clasa
	
	public Shape(String nume, String culoare) {    //variabila locala
		this.nume = nume;
		this.culoare = culoare;
  	}
}
