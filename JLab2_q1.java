//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: inputs number and tell you if number is less than greater than of equal to zero;

package JLab2;

import java.util.*;

public class JLab2_q1
{
	public static void main(String []args)
	{
		Scanner Iput = new Scanner(System.in);
		
		int input;
		
		System.out.println("Please input a number");
		input = Iput.nextInt();
		if(input < 0)
		{
			System.out.println("The number is less than zero");
		}
		else if(input == 0)
		{
			System.out.println("The number is equal to zero");
		}
		else if(input > 0 )
		{
			System.out.println("The number is greater than zero");
		}
		
	}
}
