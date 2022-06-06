import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_numb1 = rand.nextInt(10);
		System.out.println(rand_numb1);
		
		int rand_numb2 = rand.nextInt(100);
		System.out.println(rand_numb2 + 1);
		
		double rand_numb3 = rand.nextDouble();
		System.out.println(rand_numb3 + 2.5);
		
		double rand_numb4 = rand.nextInt(575);
		double rand_numb5 = rand.nextDouble();
		System.out.println(rand_numb4 + 14 + rand_numb5);
		
	}
}
