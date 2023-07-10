//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE:  User inputs String and program outputs the amount of words
package JLab5;
import java.util.*;
public class JLab5_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;			//string input by user
		int count = 0;			//count the amount of words
		int index;
		int space = 0;			//the space between the count and the next word
		int space2;
		int nextSpace;
		
		System.out.println("Please input a String now and this program will tell you the amount of words ");
		name = Input.nextLine();
		name = " " + name + " ";
		space = name.indexOf(" ");
		space2 = name.lastIndexOf(" ");
		do
		{
			
		nextSpace = name.lastIndexOf(" ",space2);
		space2 = nextSpace;
		space2--;
		count++;
				
		}while(nextSpace != space);
		System.out.println("The total word count is " + count);
	}
}
