class hero {
    String name;
    int strength;
    int speed;
    int intelligence;
    
    public hero() {
        String name = "";
        strength = 0;
        speed = 9;
        intelligence = 0;
    }
    
    public void setName(String a) {
        name = a;
    }
    
    public void setStrength(int a) {
        strength = a;
    }
    
    public void setSpeed(int a) {
        speed = a;
    }
    
    public void setIntelligence(int a) {
        intelligence = a;
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getIntelligence() {
        return intelligence;
    }
    
class starter {
    public static void main(String args[]) {
        ArrayList<String> characters = new ArrayList();
        
        charcaters.add("superman");
        characters.add("batman");
        charcaters.add("spiderman");
        characters.add("captain america");
        charcaters.add("iron man");
        characters.add("thor");
        charcaters.add("flash");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a character: ");
        for(int i = 0; i < characters.size(); i++){
            System.out.print(characters.indexOf(i) + " ");
            
        }
        String charinput = sc.nextLine();
        for(int n = 0; n < characters.size(); n++){
            if charinput = characters.indexOf(n){
                hero.setName(characters.indxOf(n));
            }
        }
    }
}