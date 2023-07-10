//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: Determines if a number is odd or even
		
package JLab2;

import java.util.*;

public class JLab2_q3 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Please input a number now and this program will tell you if the number is odd or even");
		
		number = Input.nextInt();
		
		if(number % 2 == 1)
		{
			System.out.println("The number is ODD");
		}
		else 
		{
			System.out.println("The number is EVEN");
		}
		
	}
}
