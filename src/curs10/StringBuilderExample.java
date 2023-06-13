package curs10;

public class StringBuilderExample {

	public static void main(String[] args) {
 
		reverseString("masina");
		replaceFromString("Salut Bogdan");
		deleteFromString("telenciclopedie");
		insertIntoString("alin");
		addSpacesToText("thisIsACamelCaseText");
	}
	
	public static void reverseString(String text) {
		
    StringBuilder sb = new StringBuilder(text);	
    sb.reverse();
    
    
    System.out.println(sb);
		
	}
	
	public static void replaceFromString(String text) {
		 StringBuilder sb = new StringBuilder(text);	
		 sb.replace(6, 12, "Oana");
		 System.out.println(sb);
	}
	
	
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.delete(2, 9);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.insert(0, "test");
		System.out.println(sb);
	}
	
	
	//thisIsACamelCaseText    si vreau sa inserez un spatiu  si vreau dupa fiecare upper char sa adaug un spatiu
	
	public static void addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		
		for(int i = 0; i < sb.length(); i++) {
			
			if (Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			} 
			
		}
		System.out.println(sb);
		
	}

}
