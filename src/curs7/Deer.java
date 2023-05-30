package curs7;

public class Deer extends WildAnimal{
	
	@Override  //aceasta metoda suprascrie o metoda din clasa parinte //polimorfism -> poate sa ia mai multe forme
	public void makeSound() {
		System.out.println("Meeeee!");
	}

		
	public void eatGrass() {
		System.out.println("I eat grass and I like it");
	}

}
