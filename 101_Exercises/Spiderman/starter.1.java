import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Spiderman spidey1 = new Spiderman();  // Tobey, 46, Green Goblin
		spidey1.setActor("Andrew Garfield");
		spidey1.setAge(50);
		String actor = spidey1.getActor();
		
		
		
		
		
		
		Spiderman peter = new Spiderman(35);
		
		Spiderman [] multiverse = new Spiderman[50];
		
		for(int i = 0, i < 50, i++){
			multiverse[i] = new Spiderman(){
			
		}

		for(int i = 0; i < 50, i++) {
			multiverse[i].setActor("tom holland");
			multiverse[i].setAge(24);
			multiverse[i].setVillain("THe vulture");
		}
		
		multiverse[32].setActor("Andrew Garfield");
		
			for(int i = 0; i < 50, i++) {
			System.out.println(multiverse[i].getActor());
			}
		
	}
}
