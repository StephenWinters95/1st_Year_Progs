//NAME: STEPHEN WINTERS 
//DATE: 29/06/21
//PURPOSE: method that takes in an array of ints and returns the number of times the highest number occurred
package JLab8;
import java.util.*;
import java.util.Scanner;

public class JLab8_q2 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int marks[] = new int[10];
		int count;
		int index;
		
		for(index = 0; index < marks.length;index++)
		{
			
			marks[index] = Input.nextInt();
		}
		
		count = findHighest(marks);
		
		System.out.println("The amount of times the Highest number was entered was " + count);
		
		
	}
	public static int findHighest(int[] array)
	{
		Scanner Input = new Scanner(System.in);
		int highest = -99999;
		int length;
		int index;
		int count = 1;
		
		length = array.length;
		for(index = 0; index < length; index++)
		{
			if(array[index] == highest)
			{
				count++;
			}
			if(array[index] > highest)
			{
				highest = array[index];
				count = 1;
			}
			
		}
		return count;
		
	}
}
