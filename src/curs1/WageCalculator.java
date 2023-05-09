package curs1;

public class WageCalculator {
	
	int weekHours = 40;

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Oana", 30);   //aici am instantiat clasa Tester  //am declarat in constructor
		//tester1.setNume("Oana");    
		//tester1.ratePerHour = 30;                      //nu este recomandata(poate fi uitata sau modificata)
		
		
		System.out.println(tester1.getNume());
		
		Tester tester2 = new Tester("Ioana", 25);                 //clasa Tester obiectul tester2 = new constructorul Tester()
		//tester2.setNume("Ioana");                      //pt ca variabila e privata ne folosim de set
		//tester2.ratePerHour = 25;                      // pt ca variabila e publica apelarea se face direct;
		
		System.out.println(tester2.getNume());
		
		WageCalculator obj = new WageCalculator();
		//obj.calculateSalary(0);
		System.out.println("Salariul lui " + tester1.getNume() + " este " + obj.calculateSalary(tester1.ratePerHour));
	}
	
	public int calculateSalary(int ratePerHour) {
		   return weekHours * ratePerHour;
	}

}
