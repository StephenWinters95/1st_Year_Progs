//NAME: STEPHEN WINTERS 
//DATE: 29/06/21
//PURPOSE:	makes an array of Strings, ordered alphabetically, menu system.
package JLab8;
import java.util.*;
public class JLab8_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		int response;
		int count = 0;
		String[] names;
		names = new String[15];
		do {
		System.out.println("**********************************************");
		System.out.println("* PLEASE SELECT ONE OF THE FOLLOWING OPTIONS *");
		System.out.println("*                                            *");
		System.out.println("* 1. Add Name                                *");
		System.out.println("* 2. Delete Name                             *");
		System.out.println("* 3. Search for a name                       *");
		System.out.println("* 4. List all names                          *");
		System.out.println("* 5. Exit program                            *");
		System.out.println("**********************************************");
		
		response = Input.nextInt();
		Input.nextLine();
		if(response == 1)
		{
			add(count, names);
			count++;
		}
		else if(response == 2)
		{
			names = delete(count, names);
			count--;
		}
		else if(response == 3)
		{
			search(count, names);
		}
		else if(response == 4)
		{
			display(count, names);
		}
		else if(response == 5)
		{
			System.out.println("Thank You! Good-Bye :)");
		}
		else
		{
			System.out.println("Please input a number between 1-5");
		}
			
		}while(response != 5);
	}
	public static String[] add(int count,String[] names)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Input name Now");
		names[count] = Input.nextLine();
		return names;
	}
	public static String[] delete(int count, String[] names)
	{
		Scanner Input = new Scanner(System.in);
		int num=0;
		int index;
		String newArr[] = new String[15];
		String input; // The string to be deleted
		input = Input.nextLine();
		for(index = 0; index < count; index++)
		{
			if(names[index].equals(input))
			{
				index++;
			}
		newArr[num] = names[index];
		num++;
		}
		return newArr;
	}
	public static void search(int count, String[] names)
	{
		Scanner Input = new Scanner(System.in);
		String name;
		int index;
		
		System.out.println("Please enter the name you would like to search for.");
		System.out.println("And this program will tell you the index position  ");
		name = Input.nextLine();
		for(index = 0; index <
				count; index++)
		{
			if(names[index].equals(name))
			{
				System.out.println("The index position of the name " + name + " is " + index);
			}
			else 
			{
				System.out.println("The name is not at index " + index);
			}
		}
	}
	public static void display(int count, String[] names)
	{
		int index = 0;
		for(index = 0;index < count; index++)
		{
			System.out.println(names[index]);
		}
	}
}

















