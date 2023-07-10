//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs name and surname in reverse order;

package JLab4;
import java.util.*;
public class JLab4_q6 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String firstname;
		String surname;
		String newName;
		int space;
	
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		firstname = name.substring(0,space);
		surname = name.substring(space);
		newName = surname + " " + firstname;
		System.out.println("Your new Name is " + newName);
	}
}
