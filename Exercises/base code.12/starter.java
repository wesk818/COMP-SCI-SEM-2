public class starter{

    public static void main(String args[]) {
        int arr[] = new int[20];
        int arrcopy[] = new int[20];
        System.out.println("Array 1:");
        for(int i = 0; i<20; i++){
            int rand = (int)(Math.random()*50);
            arr[i] = rand;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2:");
        for(int i = 19; i >= 0; i--){
            arrcopy[i] = arr[i];
         System.out.print(arrcopy[i] + " ");
        }
}
}
