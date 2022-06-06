import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int secret = 555;
		System.out.println("Guess a number 1-1000");
		int val1 = sc.nextInt();
		if (val1 == secret) {
		System.out.println("CORRECT!!");
		}
		else
		{
		System.out.println("Incorrect");
		}
		
	}
}
