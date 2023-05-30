package curs7;

public class TestMostenire {

	public static void main(String[] args) {

		//Tester obj = new Tester();
     	//obj.setEmail(null);
		
		//Angajat -> Tester -> TesterAutomat (mostenirile)
		
		
		TesterAutomat obj = new TesterAutomat();
		obj.setProgrammingLang("Java");//clasa TesterAutomat
		obj.setDepartament("QA"); // din clasa Tester
		obj.setSeniority("Junior");  // din clasa Tester
		obj.setEmail("maria@maria.ro");  // din clasa Angajat
		obj.setNume("maria");  // din clasa Angajat
		
	}

}
