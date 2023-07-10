//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs name outputs firstname
package JLab4;
import java.util.*;
public class JLab4_q2 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String firstname;
		int space;
	
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		firstname = name.substring(0,space);
		System.out.println("Your firstname is " + firstname);
	}
}
