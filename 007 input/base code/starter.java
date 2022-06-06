import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String text1 = sc.nextLine();
		System.out.println("How old are you?");
		int number1 = sc.nextInt();
		System.out.println("What month is your birthday in?");
		String text2 = sc.nextLine();
		System.out.println("What day in the month is your birthday on?");
		int number2 = sc.nextInt();
		System.out.println("What year is your birthday in?");
		int number3 = sc.nextInt();
		System.out.println("How much is a buck-fifty?");
		double number4 = sc.nextDouble();
		
		System.out.println("Your name is " + text1);
		
		System.out.println("You are " + number1);
		
		System.out.println("Your birthday is in " + text2);
		
		System.out.println("Your birthday is on the " + number2 +"th of june.");
		
		System.out.println("Your birthday is in the year " + number3);
		
		System.out.println("A buck fifty is " + number4);
		
		
	}
}
