package Test;

import java.util.Scanner;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Maths {

	public static void main(String[] args) 
	{
		int curr = 0;
		int max = 1000;
		/*
		while (curr <= max) 
		{
			if (curr%3 == 0) System.out.println(curr);
			else if (curr%5 == 0) System.out.println(curr);
			curr++;
		}*/
		
		
		for (int i = 0; i < 100; i++) 
		{
			if (i%3 == 0 && i%5 == 0) 
			{
				System.out.println(i);
			}
		}
	
		
		System.out.println(curr < 1000);
	}
	
	

}
