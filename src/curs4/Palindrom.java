package curs4;

public class Palindrom {

	public static void main(String[] args) {

		//radar
		//01234 index
		checkPalindrom("masina");
		
	}
	//	cuvant2 = ""
	//"" = "" + r 
	//"r"="r" + a
	//"ra"="ra"+ d
	//"rad"="rad" + a
	//"rada" = "rada" + r
	
		public static void checkPalindrom(String cuvant) {
			String cuvant2 = "";
			
			for(int i=cuvant.length()-1; i>=0; i--) {
				
				//cuvant2 += cuvant.charAt(i);
				cuvant2 = cuvant2 + cuvant.charAt(i);
				
			}
			
			String result = cuvant2.equals(cuvant) ? "Este palindrom" : "Nu este palindrom";
			System.out.println(result);
			
		}
		
	}


