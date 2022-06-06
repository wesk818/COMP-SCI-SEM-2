import java.util.Scanner;
class starter {
    public static void main(String args[])
    {
    System.out.println("Input a number to check for prime:");
    int input = 0;
    Scanner sc = new Scanner(System.in);
    input = sc.nextInt();
    printPrimes(input); 
}
  public static boolean checkPrime(int a){
    int c = 2;
    int d = 0;
    while(c<a){
      d = a%c;
      c++;
      if(d == 0){
        return false;
      }
    }
    return true;
  }
  public static void printPrimes(int b){
    int counter = 0;
    while(counter <= b){
      if(checkPrime(counter)){
        System.out.println(counter);
      }
      counter++;
    }
  }
}
