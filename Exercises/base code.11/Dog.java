public class Dog{
    public static String name;
    public static String breed;
    public static int age;
    
    public Dog(){
        name = "Clifford";
        age = 3;
        breed = "Big Red Dog";
    }
    public void Name(){
        age = 1;
        breed = "dog dog";
        name = getName();
    }   
    public void Breed(){
        age = 1;
        breed = getBreed();
        name = getName();
    }
    public void Age(){
        age = getAge();
        breed = "dog dog";
        name = getName();
    }
    public static void setName(String n){
        name = n;
    }
    public static void setAge(int a){
        age = a;
    }
    public static void setBreed(String c){
        breed = c;
    }
    public static String getName(){
        return name;
    }
    public static int getAge(){
        return age;
    }
    public static String getBreed(){
        return breed;
    }
    public static boolean isSleeping(){
        int rand = (int)(Math.random()*2)+1;
        if(rand == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void bark(){
        System.out.println(name + " barks!");
    }

}