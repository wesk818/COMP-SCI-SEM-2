import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String one = sc.nextLine();
	System.out.println("Now, how many times do you want it printed out?");
	int two = sc.nextInt();
	while(two > 0) {
		two--;
		System.out.print(one);
	}
	
	

		
	}
}
