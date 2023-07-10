//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE:  Enter numbers into array and tell you the highest and lowest number entered and how many times each was entered;
package JLab7;
import java.util.*;
public class JLab7_q3
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int array[];
		int high = -999999;
		int low = 9999999;
		int count1 = 1;
		int count2 = 1;
		int index;
		int index2;
		
		System.out.println("Please input the amount of numbers you would like to put into the array");
		index2 = Input.nextInt();
		array = new int[index2];
		for(index = 0;index < index2; index++)
		{
			System.out.println("Please input the next int");
			array[index] = Input.nextInt();
			if(array[index] == high)
			{
				count1++;
			}
			if(array[index] > high)
			{
				high = array[index];
				count1 = 1;
			}
			if(array[index] == low)
			{
				count2++;
			}
			if(array[index] < low)
			{
				low = array[index];
				count2 = 1;
			}
			
		}
		System.out.println("The Highest number enterd was " + high + " and it was entered " + count1);
		System.out.println("The lowest number entered was " + low + " and it was entered " + count2);
	}
}

