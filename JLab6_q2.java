//NAME: STEPHEN WINTERS 
//DATE: 26/06/21
//PURPOSE: takes character as input and outputs where it is upper case
package JLab6;
import java.util.*;
public class JLab6_q2 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		char letter;
		boolean ans;

		System.out.println("Please input aa char and this program will output wether it is pper case or not");
		letter = Input.next().charAt(0);
		ans = isAlpha(letter);
		System.out.println("The character being upper case is " + ans);
	}
	public static boolean isAlpha(char input)
	{
		char Upper;
		Upper = Character.toUpperCase(input);
		if(Upper == input)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
