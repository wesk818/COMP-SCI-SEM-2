
import java.util.Scanner;
public class starter{
	
		
		public static void main(String args[])
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the price(number) and Clothing Producer(word) of the object separated by a comma:");
			String input = sc.nextLine();
			int x = Integer.parseInt(input.substring(0,input.indexOf(",")));
			String y = (input.substring(input.indexOf(",")+1, input.length()));
			System.out.println("Enter the type of clothing(Designer, Shirts, Socks, Pants):");
			String b = sc.nextLine();
			if(b.equals("Designer") || b.equals("designer")){

				System.out.println("Enter the brand:");
				String brand = sc.nextLine();
				Designer do1 = new Designer(x,y);
				do1.assignbrand(brand);
				System.out.println("Price: " + do1.getPrice());
				System.out.println("Producer: " + do1.getProducer());
				System.out.println("Type: " + do1.getInfo());
			}
			if(b.equals("Shirts") || b.equals("shirts")){
				System.out.println("Enter the material:");
				String mat = sc.nextLine();
				Shirts do2 = new Shirts(x,y);
				do2.assignmaterial(mat);
				System.out.println("Price: " + do2.getPrice());
				System.out.println("Producer: " + do2.getProducer());
				System.out.println("Material: " + do2.getInfo());
			}
			if(b.equals("Socks") || b.equals("socks")){
				System.out.println("Enter the type:");
				String type = sc.nextLine();
				Socks do3 = new Socks(x,y);
				do3.assigntype(type);
				System.out.println("Price: " + do3.getPrice());
				System.out.println("Producer: " + do3.getProducer());
				System.out.println("Type: " + do3.getInfo());
			}
			if(b.equals("Pants") || b.equals("pants")){
				System.out.println("Enter the length:");
				int len = sc.nextInt();
				Pants do4 = new Pants(x,y);
				do4.assignlength(len);
				System.out.println("Price: " + do4.getPrice());
				System.out.println("Producer: " + do4.getProducer());
				System.out.println("Type: " + do4.getInfo());
			}	
			
		}
		

}
