package curs7;

public class Patrat extends Shape{

	public Patrat(String nume, String culoare) {   //constructorul clasei copil
		super(nume, culoare);
	}

	//super e un keyword in java si e o referinta catre obiectul clasei parinte; apare doar in contextul mostenirii
	//cand clasa parinte are constructor, clasa copil trebuie sa implemenze constructor
	//cosntructorul nu se mosteneste
	
	//obiect al clasei Patrat
	String nume = "Patrat";
	String culoare = "Negru";
	//obiect al clasei SHape
	//super.nume
	// super -> referinta catre obiectul clasei parinte
	
	
	
	public void printDetails() {
		System.out.println("Numele este " + super.nume + " si culoarea este " + super.culoare);
	}
	
	
}
