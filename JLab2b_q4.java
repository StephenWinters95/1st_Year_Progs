//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: inputs 3 numbers and put puts the lowest,middle and highest;
package JLab2b;

import java.util.Scanner;

public class JLab2b_q4 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int lowest;
		int middle;
		int highest;
		
		System.out.println("Input 3 numbers and this program will tell you the lowest, highest and middle");
		
		num1 = Input.nextInt();
		num2 = Input.nextInt();
		num3 = Input.nextInt();
		
		lowest = num1;
		if(num1 > num2)
		{
			lowest = num2;
		}
		else if(num1 > num3)
		{
			lowest = num3;
		}
		
		middle = num1;
		if((num1 < num2) && (num2 < num3))
		{
			middle = num2;
		}
		else if((num1 < num3) && (num3 < num2))
		{
			middle = num3;
		}
		
		highest = num1;
		if(num1 < num2)
		{
			highest = num2;
		}
		if((num1 < num3 ) && (num3 >num2))
		{
			highest = num3;
		}
		System.out.println(lowest);
		System.out.println(middle);
		System.out.println(highest);
	}
}
