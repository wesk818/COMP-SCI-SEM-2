package pkg;
import java.util.Scanner;
import java.util.Random;


public class Rogue {
	String name;
	int health;
	int attack;

	public Rogue() {
		name = "Jim";
		health = 100;
		attack = 25;
		
	}
public Rogue(String name) {
		this.name = name;
		health = 100;
		attack = 25;
}

public void sethealth(int h) {
	health = h;
}

public int gethealth() {
	return health;
}


public String getname() {
	return name;
}

public void attack(Warrior w) {
	Random rand = new Random();
	int attack = rand.nextInt(25);
	
	
}


}






