//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs full name outputs number of characters entered;

package JLab4;

import java.util.Scanner;

public class JLab4_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int length;
		
		name = Input.nextLine();
		length = name.length();
		System.out.println("The number of characters entered is " + length);
	}
}
