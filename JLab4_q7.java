//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs name and surname in reverse order;

package JLab4;
import java.util.*;
public class JLab4_q7 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		char letter;
		int index;
		int count = 0;
		int length;
		
		name = Input.nextLine();
		length = name.length();
		for(index = 0; index < length -1; index++)
		{
			letter = name.charAt(index);
			if((letter == 'a') || (letter == 'A'))
			{
				count++;
			}
					
		}
		System.out.println("The amount of times the letter a was entered is " + count);
		
	}
}
