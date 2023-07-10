//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs number of upperCase characters entered;
package JLab4;
import java.util.*;
public class JLab4_q4 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int count = 0;
		int index;
		char current;
		char current2;
		
		name = Input.nextLine();
		for (index = 0; index < name.length();index++)
		{
			current = name.charAt(index);
			current2 = Character.toUpperCase(current);
			if(current != ' ')
			{
			if(current == current2)
			{
				count++;
			}
			}
		}
		System.out.println("The amount of upper case characters in the given String is " + count);
	}
}
