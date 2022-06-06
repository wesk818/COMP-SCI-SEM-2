import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("Guess and random number between 1 and 1000");
int guess = sc.nextInt();
int secretnumber = 321;
if(guess == secretnumber) {
	System.out.println("You guessed right");
}
while(guess != secretnumber) 
{
	System.out.println("Wrong number guess again");
	int guess1 = sc.nextInt();

if(guess1 == secretnumber) {
	System.out.println("Correct, good job!");
	break;

	
}

}


		
	}
}
