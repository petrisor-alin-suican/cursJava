package curs11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFileProcessor {
	
	//write txt file
	 public void writeFile(String textToWrite) {
		 
		 try (FileWriter fileWriter = new FileWriter("file.txt")){
			 
			 fileWriter.write(textToWrite);
			// fileWriter.close();   l-am pus in try ca parametru
			 System.out.println("Successfully wrote to file!");
			 
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 // read txt file
	 public void readFile() {
		 File obj = new File("file.txt");
		 
		 try {
		 Scanner scan = new Scanner(obj);
		 while(scan.hasNext()) {
			 String text = scan.nextLine();
			 System.out.println(text);
		 }
		 scan.close();
		 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 
	 //update
	 
	 public void updateFile(String textToAdd) {
		 
           try (FileWriter fileWriter = new FileWriter("file.txt", true)){
			 fileWriter.write(textToAdd);
			 System.out.println("Successfully wrote to file!");
			 
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 //delete
	 
	 public void deleteLineFromFile(String deleteText, String textToReplace) throws IOException {
		 
		// String data = "";
		 String data = new String(Files.readAllBytes(Paths.get("file.txt")));
		 
		 try (FileWriter fileWriter = new FileWriter("file.txt")){
			data = data.replaceAll(deleteText, textToReplace);
			 fileWriter.write(data);

		 } catch(IOException e) {
			 e.printStackTrace();
		 }
		 
	 }

}
