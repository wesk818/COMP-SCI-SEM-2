import java.util.Scanner;
import java.util.Random;

class Cat {
	String name;
	public Cat(){
		name = "Garfield";
	}
	public Cat(String a) {
		name = a;
	}
	public void meow() {
		System.out.println(name + " Meows");
	}
		
	
}
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	Cat one = new Cat();
	Cat two = new Cat("Bobby");
	one.meow();
	two.meow();
	
	
	}

}

