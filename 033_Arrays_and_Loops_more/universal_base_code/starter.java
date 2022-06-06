import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public int getTheResult(int n)
{
		int product = 1;
		for(int number = 1; number < n; number++)
	{
		if(number % 2 == 0)
		product *= number;
	}

return product;



}
}