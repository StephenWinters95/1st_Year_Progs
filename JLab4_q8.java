//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs name and surname only;

package JLab4;
import java.util.*;
public class JLab4_q8 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		String first;
		String last;
		int index;
		String name;
		int space;
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		first = name.substring(0 ,space);
		space = name.lastIndexOf(" ");
		last = name.substring(space, name.length());
		name = first + last;
		System.out.println("The name with the first and last surname only is " + name);
		
	}
}
