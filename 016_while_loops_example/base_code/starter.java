import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);

System.out.println("What is your name?");
String name = sc.nextLine();
System.out.println("How many times do you want it to be printed?");
int number = sc.nextInt();
int c = number;
if(c == number)
while(true) {
	System.out.println(name);
	if(c == 1) {
		break;
	}
	
c -= 1;
}

		
	}
}
