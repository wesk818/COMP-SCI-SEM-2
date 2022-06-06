import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
		
		String v2 = new String ("wizard");
		String v3 = new String ("warrior");
		String v4 = new String ("rogue");
		
		String v5 = new String ("Wizard");
		String v6 = new String ("Warrior");
		String v7 = new String ("Rogue");
		
		System.out.println("Do you want to be a wizard, warrior, or rogue?");
		String ans = sc.nextLine();
		
		if (ans .equals("wizard") || (ans .equals("Wizard"))) {
			System.out.println("Wizards are cool.");
		}
		
		if (ans .equals("warrior") || (ans .equals("Warrior"))){
			System.out.println("Warriors are fierce.");
		}
		
		if (ans .equals("rogue") || (ans .equals("Rogue"))) {
			System.out.println("Rogues are dope.");
		}
		String a = new String("Strength");
		String b = new String("strength");
		String c = new String("Dexterity");
		String d = new String("dexterity");
		String e = new String("Intelligence");
		String f = new String("intelligence");
		String g = new String("Constitution");
		String h = new String("constitution");
		String i = new String("Charisma");
		String j = new String("charisma");
		int total;
		total = 25;
		
		
		System.out.println("Enter an integer 1-10 for strength points.");
		int strength = sc.nextInt();
			if(strength > total || strength > 10){
			System.out.println("Please input a smaller number between 1-10.");
			strength = sc.nextInt();
			total = (total - strength);
			System.out.println("You have " + total + " points remaining.");
			}
			else if(strength < total || strength < 10){
			total = (total - strength);
			System.out.println("You have " + total + " points remaining.");
			}
		
		System.out.println("Enter an integer 1-10 for dexterity points.");
		int dexterity = sc.nextInt();
			if(dexterity > total || dexterity > 10){
			System.out.println("Please input a smaller number between 1-10.");
			dexterity = sc.nextInt();
			total = (total - dexterity);
			System.out.println("You have " + total + " points remaining.");
			}
			else if(dexterity < total || dexterity < 10){
			total = (total - dexterity);
			System.out.println("You have " + total + " points remaining.");
			}
		
		System.out.println("Enter an integer 1-10 for intelligence points.");
		int intelligence = sc.nextInt();
			if(intelligence > total || intelligence > 10){
			System.out.println("Please input a smaller number between 1-10.");
			intelligence = sc.nextInt();
			total = (total - intelligence);
			System.out.println("You have " + total + " points remaining.");
			}
			else if(intelligence < total || intelligence < 10){
			total = (total - intelligence);
			System.out.println("You have " + total + " points remaining.");
	
			}
		System.out.println("Enter an integer 1-10 for constitution points.");
		int constitution = sc.nextInt();
			if(constitution > total || constitution > 10){
			System.out.println("Please input a smaller number between 1-10.");
			constitution = sc.nextInt();
			total = (total - constitution);
			System.out.println("You have " + total + " points remaining.");
			}
			else if(constitution < total || constitution < 10){
			total = (total - constitution);
			System.out.println("You have " + total + " points remaining.");
			}
			
		System.out.println("Enter an integer 1-10 for charisma points.");
		int charisma = sc.nextInt();
			if(charisma > total || charisma > 10){
			System.out.println("Please input a smaller number between 1-10.");
			charisma = sc.nextInt();
			total = (total - charisma);
			System.out.println("You have " + total + " points remaining.");
			}
			else if(charisma < total || charisma < 10){
			total = (total - charisma);
			System.out.println("You have " + total + " points remaining.");
			}
			
			System.out.println("You are a " + ans + " with " + strength + " strength, " + dexterity + " dexterity, " + intelligence + " intelligence, "
			 + constitution + " constitution, and " + charisma + " charisma.");

	}
	
		
	
}
