package curs9;

public class VarargsExample {

	public static void main(String[] args) {

		
		printArguments("test", "test2");
		
		//JavascriptExecutor - librarie din Selenium
		//executeScript(" ", webelement1 ) - metoda din Selenium		
		//executeScript(" ", webelement1, webelement2 )
		
		printVariableArguments("unu", "doi", "trei", "patru");
		
	}
	
	
	public static void printArguments(String str1, String str2) {
		
		System.out.println(str1 + " " + str2);
	}

	public static void printVariableArguments(String...values) {                                   //string...  -> vreau o lista de argumente   //o metoda poate sa aiba o singura serie de argumente variabile
		
		for(String obj:values) {                                                                   // pot pune int number, String...values  // nu pot incepe cu o lista de arg variabile, urmate de alte variabile
			System.out.println(obj);
			
		}
		
	}
}
