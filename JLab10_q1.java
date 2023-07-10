//NAME: STEPHEN WINTERS 
//DATE: 05/06/21
//PURPOSE: Program to add,delete, search, and list names in a given array;
package JLab10;
import java.util.*;
public class JLab10_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		Footballer[] players = new Footballer[4];
		int index;
		String name;
		
		for(index = 0;index < 4; index ++)
		{
		System.out.println("Please input the name for the next player");
		name = Input.nextLine();
		players[index] = new Footballer(name);
		}
	}
}
