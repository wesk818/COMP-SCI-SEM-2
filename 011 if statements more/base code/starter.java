import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		if (val1 != val2) {
		System.out.println("TV is cool");
		}
		if (val1 == val2) { 
		System.out.println("Tv is boring");
		}
	}
}
