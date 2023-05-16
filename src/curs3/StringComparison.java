package curs3;

public class StringComparison {

	public static void main(String[] args) {
		
		//= = -> verifica daca e aceeasi locatie din memorie, daca e din acelasi obiecit
		//equals -> verifica continutul indiferent de locatia din memorie	
		
		
        String unu = "Java";
        String doi = "Automation";
        String trei = "Java";
        String patru = new String("Java");
        
        System.out.println("Case: == ");
        System.out.println(unu == doi);
        System.out.println("Case: equals");
        System.out.println(unu.equals(doi));
        System.out.println("-------------");
        
        
        System.out.println("Case: == ");
        System.out.println(unu == trei);
        System.out.println("Case: equals");
        System.out.println(unu.equals(trei));
        System.out.println("-------------");
        
        
        System.out.println("Case: == ");
        System.out.println(unu == patru);  //nu mai este aceeasi locatie de memorie
        System.out.println("Case: equals");
        System.out.println(unu.equals(patru));  //verifica valoarea
        System.out.println("-------------");
	}  

}
