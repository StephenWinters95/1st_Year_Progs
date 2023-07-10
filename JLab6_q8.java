//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE: Finds the index position of the ;ast space in a given String
package JLab6;
import java.util.*;
import java.util.Scanner;

public class JLab6_q8 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int index;
		int point;
		
		System.out.println("Please input a String and then an index position to ostart looking for the first space backwards from");
		name = Input.nextLine();
		point = Input.nextInt();
		index = myLastSpace(point, name);
		System.out.println("The index position of the last space in the given String is " + index);
	}
	public static int myLastSpace(int point ,String name)
	{
		int index;
		index = name.lastIndexOf(" ",point);
		return index;
	}
}
