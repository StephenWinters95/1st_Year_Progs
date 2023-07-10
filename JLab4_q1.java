//NAME: STEPHEN WINTERS 
//DATE: 14/06/21
//PURPOSE: inputs full name outputs surname
package JLab4;

import java.util.*;

public class JLab4_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String surname;
		int length;
		int space;
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		name = name + " ";
		surname = name.substring(space, name.length());
		System.out.println("Your surname is " + surname);
		
		
		
		
	}
}
