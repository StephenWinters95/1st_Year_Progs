//NAME: STEPHEN WINTERS 
//DATE: 05/06/21
//PURPOSE: Program to add,delete, search, and list names in a given array;
package JLab12;
import java.util.*;
public class JLab12_q1
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int response;
		int count = 0;
		Footballer[] players;
		players = new Footballer[15];
		do{
		
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
			add(count, players);
			count++;
		}
		else if(response == 2)
		{
			players = delete(count, players);
			count--;
		}
		else if(response == 3)
		{
			search(count, players);
		}
		else if(response == 4)
		{
			display(count, players);
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
	public static Footballer[] add(int count,Footballer[] players)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Input name Now");
		String playerInput = Input.nextLine();
		players[count] = new Footballer(playerInput);
		
		return players;
	}
	public static Footballer[] delete(int count, Footballer[] players)
	{
		Scanner Input = new Scanner(System.in);
		int num=0;
		int index;
		Footballer newArr[] = new Footballer[15];
		String input; // The string to be deleted
		input = Input.nextLine();
		for(index = 0; index < count; index++)
		{
			if(players[index].getName().equals(input))
			{
				index++;
			}
		newArr[num] = players[index];
		num++;
		}
		return newArr;
	}
	public static void search(int count, Footballer[] names)
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
			if(names[index].getName().equals(name))
			{
				System.out.println("The index position of the name " + name + " is " + index);
			}
			else 
			{
				System.out.println("The name is not at index " + index);
			}
		}
	}
	public static void display(int count, Footballer[] names)
	{
		int index = 0;
		for(index = 0;index < count; index++)
		{
			System.out.println(names[index]);
		}
	}
}
