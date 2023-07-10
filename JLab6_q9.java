//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE: Finds the index position of the second last space in a given String
package JLab6;

import java.util.Scanner;

public class JLab6_q9 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int index;
		
		name = Input.nextLine();
		index = myLastSpace(name);
		System.out.println("The index position of the second last space in the given String is " + index);
	}
	public static int myLastSpace(String name)
	{
		int index;
		int index2;
		index = name.lastIndexOf(" ");
		index2 = index;
		index = name.lastIndexOf(" ", index2);
		return index + 1;
	}
}
