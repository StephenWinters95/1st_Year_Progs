//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE:  Enter numbers into array and tell you the highest and lowest number entered
package JLab7;
import java.util.*;
public class JLab7_q2 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int array[];
		int high = -999999;
		int low = 9999999;
		int index;
		int index2;
		
		System.out.println("Please input the amount of numbers you would like to put into the array");
		index2 = Input.nextInt();
		array = new int[index2];
		for(index = 0;index < index2; index++)
		{
			System.out.println("Please input the next int");
			array[index] = Input.nextInt();
			if(array[index] > high)
			{
				high = array[index];
			}
			if(array[index] < low)
			{
				low = array[index];
			}
			
		}
		System.out.println("The Highest number enterd was " + high + " The lowest number entered was " + low);
	}
}
