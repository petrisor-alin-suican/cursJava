package curs7;

public class TestShape {

	public static void main(String[] args) {

		Patrat patrat = new Patrat("Cerc", "Galben");
		System.out.println(patrat.nume);
		System.out.println(patrat.culoare);
		
		patrat.printDetails();
	}

}


//in momentul executie java va gasi 2 var nume si 2 culoare (claseele shape si patrat)
//va prioritiza variabila/metoda care se afla intre parantezele obiectului definit
//daca vreau sa fac referinta catre clasa parinte folosesc super
