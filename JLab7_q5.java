//NAME: STEPHEN WINTERS 
//DATE: 29/06/21
//PURPOSE: Inputs an array of chars and this program tells you if its a palindrome or not
package JLab7;
import java.util.*;
public class JLab7_q5 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		char array[];
		int index;
		int index2 = 5;
		boolean ans = true;
		array = new char[5];
		
		for(index = 0; index < 5; index++)
		{
			array[index] = Input.next().charAt(0);
		}
		for(index = 0; index  <= 3; index++)
		{
			if(array[index] != array[index2 - 1])
				{
				ans = false;
				}
			index2--;
			System.out.println("Worked");
		}
		System.out.println("The list of chars entered being a palindrome is " + ans);
		
	}
}
