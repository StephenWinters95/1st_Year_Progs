//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE: Method called my last space, finds the index position of the last space in the string
package JLab6;
import java.util.*;
public class JLab6_q7 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int index;
		
		name = Input.nextLine();
		index = myLastSpace(name);
		System.out.println("The index position of the last space in the given String is " + index);
	}
	public static int myLastSpace(String name)
	{
		int index;
		index = name.lastIndexOf(" ");
		return index;
	}
}
