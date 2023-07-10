//NAME: STEPHEN WINTERS 
//DATE: 29/06/21
//PURPOSE: method that takes in an array of ints and returns highest number
package JLab8;
import java.util.*;
public class JLab8_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int marks[] = new int[10];
		int highest;
		int index;
		
		for(index = 0; index < marks.length;index++)
		{
			
			marks[index] = Input.nextInt();
		}
		
		highest = findHighest(marks);
		
		System.out.println("The Highest number entered was " + highest);
		
		
	}
	public static int findHighest(int[] array)
	{
		Scanner Input = new Scanner(System.in);
		int highest = -99999;
		int length;
		int index;
		
		length = array.length;
		for(index = 0; index < length; index++)
		{
			if(array[index] > highest)
			{
				highest = array[index];
			}
		}
		return highest;
		
	}
}