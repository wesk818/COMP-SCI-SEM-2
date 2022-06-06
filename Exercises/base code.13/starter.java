import java.util.Scanner;
public class starter{


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1:");
        int one = sc.nextInt();
        System.out.println("number 2:");
        int two = sc.nextInt();
        if(one%2 == 0 && two %2 == 0){
            System.out.println("Both the numbers are even.");    
        }
        else if(one %2 != 0 && two%2 ==0){
            System.out.println("First input is odd while the second input is even.");
        }
        else if(one%2 ==0 && two%2 != 0){
            System.out.println("First input is even while the second input is odd.");
        }
        else{
            System.out.println("Both of the numbers are odd.");
        }
        if(one%3==0){
            System.out.println("first input is divisible by 3.");
        }
        if(one%4 == 0){
            System.out.println("first input is divisible by 4.");
        }
        if(one%5 == 0){
            System.out.println("first input is divisible by 5.");
        }
        if(two%3==0){
            System.out.println("second input is divisible by 3.");
        }
        if(two%4 == 0){
            System.out.println("second input is divisible by 4.");
        }
        if(two%5 == 0){
            System.out.println("second input is divisible by 5.");
        }
        
        if(one%3!=0 && one%4!=0 && one%5!=0){
            System.out.println("first input is not divisible by 3,4,5.");
        }
        if(two%3!=0 && two%4!=0 && two%5!=0){
            System.out.println("second input is not divisible by 3,4,5.");
        }
        
}
}