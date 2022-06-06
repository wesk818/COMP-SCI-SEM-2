import java.util.Scanner;
public class starter{

  public static void main(String args[]) {
      int arr[] = new int[20];
      for(int i = 0; i <20; i++){
        arr[i] = (int)(Math.random()*10);
      }
      int counter = 0;
      System.out.println("Pick a number between 1 and 10:");
      Scanner sc = new Scanner(System.in);
      int intput = sc.nextInt();
      System.out.println("Your number shows up at:");
      for(int c = 0; c<20; c++){
        if(arr[c]==intput){
          counter++;
          System.out.print("Index: " + c + " ");
        }
      }
      System.out.println("Number of times: " + counter);
      System.out.println();
      System.out.println();
      int counter2 = 0;
      int num = 0;
      for(int d = 0; d<20; d++){
        for(int e = 1; e<20; e++){  
          if(arr[d]==arr[e]){
            System.out.print("Index: " + d + " ");
            num = arr[d];
          }
        }
      }
      System.out.println("Number of times: " + counter2 + " Number is: " + num);
     
}
}
