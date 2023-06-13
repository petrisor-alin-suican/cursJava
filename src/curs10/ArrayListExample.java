package curs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println("------------------------------------------------");
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		
		
		
		System.out.println("------------------------------------------------");
		
		System.out.println(list.get(2));     //Maria este la index 2
		
		
		
		
		System.out.println("------------------------------------------------");
		
		list.add(0, "Carmen");
		
		list.add(1, "Maria");
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		
		
		System.out.println("------------------------------------------------");
		
		System.out.println(list.get(4));
		
		list.add(6, "Vasile");
		
		
		
		
		
		System.out.println("------------------------------------------------");
	
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		
		
		
		System.out.println("------------------------------------------------");
		
		list.remove(0);
		list.remove("Maria");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		
		
		
		System.out.println("------------------------------------------------");
		
		list.clear();
		System.out.println(list.size());
		
	}
	

}
