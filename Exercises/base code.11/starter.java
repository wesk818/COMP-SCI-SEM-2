public class starter{

    public static void main(String args[]) {
        Dog wes = new Dog();
        wes.setName("wesley");
        boolean didbark;
        String name1 = wes.getName();
        if(!wes.isSleeping()){
            wes.bark();
            didbark = true;
        }
        else{
            System.out.println(name1 + " is sleeping.");
            didbark = false;
        }
        Dog wes2 = new Dog();
        wes2.setName("Wesley2");
        String name2 = wes2.getName();
        if(didbark && !wes2.isSleeping()){
            wes2.bark();
        }    
        else if(wes2.isSleeping() && didbark){
            wes2.bark();
        }
    }
}


