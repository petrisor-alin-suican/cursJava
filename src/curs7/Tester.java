package curs7;

public class Tester extends Angajat{   //sunt mostenite variabilele din ANgajat; daca sunt private folosim getter si setter

	private String seniority;
	private String departament;
	
	
	
	public String getSeniority() {
		return seniority;
	}
	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}
	
	
	public String getDepartament() {
		return departament;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
	
	
	
}
