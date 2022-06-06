import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number 1-1000"); 
		int val1 = sc.nextInt();
		int secret = 661;
		if (val1 > secret) {
		System.out.println("Too big");
		}
		else if(val1 < secret)
		{
		System.out.println("Too small");
		}
		else if (val1 == secret); {
		System.out.println("CORRECT!");
		}
	
		
	}
	
	
}
