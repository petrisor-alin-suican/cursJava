package curs3;

public class TestStatic {

	public static void main(String[] args) {
	
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.prenume = "Ceva";
		obj.nume = "Altceva";
		
		obj.printNormal();
		//obj.printStatic();                //accesare intr-un mod static;   nu este asociata cu obiectul
		
		StaticVsNonStatic.nume = "Altceva";    
		StaticVsNonStatic.printStatic();    //variabia nume si metoda static sunt incarcate in memorie inainte de instantierea obiectului;  se executa inainte de crearea obiectului;
		                                    // va avea intotdeauna aceeasi valoare pana o rescri
		
		
		
		/*
		 * 1.compileaza
		 * ....
		 * 3. incarca in memorie membrii statici
		 * ....
		 * 5.Instantiaza obiecte
		 */
	}

}
