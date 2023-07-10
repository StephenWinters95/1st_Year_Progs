//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs input backwards;

package JLab4;
import java.util.*;
public class JLab4_q5 
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String backwards = "";
		char letter;
		int index;
		int length;
		int length2;
		int count;
		
		name = Input.nextLine();
		length = name.length();
		length2 = length;
		for (index =0;index < length; index++)
		{
			
			letter = name.charAt(length2 - 1);
			backwards = backwards +letter;
			length2 --;
		}
		System.out.println("The word backwards is "  + backwards);
		
	}
}
