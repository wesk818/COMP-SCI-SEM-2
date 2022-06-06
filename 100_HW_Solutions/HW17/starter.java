import pkg.*;
import java.util.ArrayList;
import java.util.Scanner;    

public class robot{

private int[] hall;
    private int pos;
    private boolean facingRight;
    private boolean forwardMoveBlocked(){
        if(facingRight && pos>=hall.length()-1){
         return true;
        }
      else if(!facingRight){
            return true;
        }
         return false;
        }
    private void move(){
        if(hall[pos]=0){
       	if(forwardMoveBlocked){
             facingRight = false;
            }
            else if(facingRight){
                pos++;
            }
         else{
             pos--;
            }
        }
    }
    public int clearHall(){
     int counter = 0;
       while(!hallIsClear()){
   
         counter++;    
        }
     return counter;
    }
      private boolean hallIsClear(){
        //given
    }

    }
