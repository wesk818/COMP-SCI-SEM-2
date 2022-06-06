import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
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
		
	}
}
