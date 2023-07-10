//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE: Reads in an array of integers and tells you the number of odd and even number;
package JLab7;
import java.util.*;
public class JLab7_q1 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int array[];
		int oddCount =0;
		int evenCount= 0;
		int index;
		int index2;
		
		System.out.println("Please input the amount of numbers you would like to put into the array");
		index2 = Input.nextInt();
		array = new int[index2];
		for(index = 0;index < index2; index++)
		{
			System.out.println("Please input the next int");
			array[index] = Input.nextInt();
			if(isEven(array[index]))
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
		}
		System.out.println("The amount of odd numbers was " + oddCount + " The amount of even was " + evenCount);
		
		
		
	}
	public static boolean isEven(int num)
	{
		if(num % 2 == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
