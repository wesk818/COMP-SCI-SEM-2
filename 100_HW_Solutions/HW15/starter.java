import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		specialSquare(5);
	
		
		
	}
public static void specialSquare(int n){
	int som = 0;
	int p = 0;
	int sq = 0;
	int addfactor = 1;
	int runs = 0;
	while(true){
if(runs == n){
	break;
}
	sq = p * p;
	while(som < sq){
		som += addfactor;
		addfactor++;
		if(som == sq){
			System.out.println(sq);
			runs++;
			break;
		}
	}
	p++;
		
	}
	
	
}
}