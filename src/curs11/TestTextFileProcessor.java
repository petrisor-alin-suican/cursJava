package curs11;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {

		TextFileProcessor obj = new TextFileProcessor();
		obj.writeFile("bla bla bla3\n");
		obj.readFile();
		obj.updateFile("alt text adaugat in fisier\n");
		obj.deleteLineFromFile("alt text adaugat in fisier", "");
		
	}

}
