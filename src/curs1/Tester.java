package curs1;


public class Tester {
	
	//variabile
	private String nume;
	public int ratePerHour;
	
	//getter  //metode
	public String getNume() {
		return nume;
	}
	
	//setter
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	// constructor 
	//public Tester() {}
	
	public Tester(String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
		
	}
	
	
	
	//Tester obj = new Tester();
	/*
	 * getter, setter -- metode
	 * Tester -- numele clasei
	 * obj -- numele obiectului
	 * = operator de atribuire
	 * new  - cuvant cheie in java care ne ajuta sa instantiem o clasa
	 * Tester() - constructor
	 * membrii clasei = variabile(nume ratePerHour si metode getNume setNume
	 */
	//Tester obj = new Tester();    -> setam obiecte;   aici instantiem o clasa;  
	//obj.setNume("Oana");
}
