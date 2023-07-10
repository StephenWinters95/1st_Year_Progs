//NAME: STEPHEN WINTERS 
//DATE: 26/06/21
//PURPOSE: Counts the amount of characters in a String (Dosent notice diffrence between number and characters);
package JLab6;
import java.util.*;
public class JLab6_q3
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		String input;
		int count;
		
		System.out.println("Input a string now and this program will give you the amount of characters entered");
		input = Input.nextLine();
		count = alphaCount(input);
		System.out.println("The number of alphabetic characters in the String is " + count);
	
	}
	public static int alphaCount(String name)
	{
		int index;
		int theCount;
		theCount = name.length();
		for(index = 0; index < name.length(); index++)
		{
			if(name.charAt(index) == ' ')
			{
				theCount--;
			}
		}
		return theCount;
	}
}
