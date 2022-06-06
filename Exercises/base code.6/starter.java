import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	 int startWager = 100;
     int wagerInput = 0;
    System.out.println("Would you like to play slots? (Yes/y No/n)");
    while(startWager >= 0){
    String accept = sc.nextLine();
     if(accept.equals("N") || accept.equals("n") || accept.equals("No") || accept.equals("no")){
      System.out.println("Thanks for playing! Your final balance is " + startWager);
      break;
    }  
     if(accept.equals("Y") || accept.equals("y") || accept.equals("Yes") || accept.equals("yes")){
      System.out.println("What is your wager? Your Current Balance is " + startWager);
      wagerInput = sc.nextInt();
      int rand = (int)(Math.random()*10);
      int rand2 = (int)(Math.random()*10);
      int rand3 = (int)(Math.random()*10);
      System.out.println(rand + "|" + rand2 + "|" + rand3 + "|");
      if(rand == rand2 || rand2 == rand3 || rand == rand3){
        System.out.println("You Won a double!");
        startWager = startWager + wagerInput*2;
        System.out.println("Your balance is now " + startWager + ". Would you like to play again? (Yes/y No/n)");
      }
      else if(rand == rand2 && rand2 == rand3){
        System.out.println("You won a triple!");
          startWager = startWager + wagerInput*3; 
          System.out.println("Your balance is now " + startWager + ". Would you like to play again? (Yes/y No/n)");
        }
      if(rand != rand2 && rand2 != rand3 && rand != rand3){
          startWager = startWager-wagerInput;
          System.out.println("You didn't win this time. Your balance is now " + startWager + ". Would you like to play again? (Yes/y No/n)");
        }
        if(startWager <= 0){
          System.out.println("You have no more money to wager.");
          break;
         }
        }
      }  
	

	
	
	}

}

