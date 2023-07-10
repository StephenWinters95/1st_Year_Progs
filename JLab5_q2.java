//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs a string and outputs the words in reverse order

package JLab5;
import java.util.*;
public class JLab5_q2 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String newName = " ";
		String sub;
		int count;
		int lastIndex;
		int nextIndex;
		int Index;
		
		System.out.println("Pease input a String now. ");
		name = Input.nextLine();
		name = " " + name + " ";
		Index = name.indexOf(" ");
		lastIndex = name.lastIndexOf(" ");
		
		do
		{
			nextIndex = name.lastIndexOf(" ",lastIndex);
			sub = name.substring(nextIndex,lastIndex + 1);
			newName = newName + sub;
			lastIndex = nextIndex;
			lastIndex--;
			
			
		}while(nextIndex != Index);
		System.out.println("The String in reveres is: " + newName);
	}
	
}
