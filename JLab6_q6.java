//NAME: STEPHEN WINTERS 
//DATE: 27/06/21
//PURPOSE: Menu system but with all the progs in lab sheet 4
package JLab6;
import java.util.*;
public class JLab6_q6 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		int input;
		
		do 
		{
			System.out.println("**********************************************");
			System.out.println("* Please select one of the following options *");
			System.out.println("* 1. Input full name - outputs surname       *");
			System.out.println("* 2. Input full name - outputs firstname     *");
			System.out.println("* 3. Counts characters input                 *");
			System.out.println("* 4. Counts upper case characters in input   *");
			System.out.println("* 5. Entire string in reverse                *");
			System.out.println("* 6. Words in reverse                        *");
			System.out.println("* 7. Input String and then char to be searche*");
			System.out.println("* 8. input full name outputs middle name     *");
			System.out.println("* 9. Exit Program:                           *");
			System.out.println("**********************************************");
			input = Input.nextInt();
			switch(input)
			{
			case 1:
				surname();
				break;
			case 2:
				firstname();
				break;
			case 3:
				count();
				break;
			case 4:
				upper();
				break;
			case 5:
				reverse();
				break;
			case 6:
				revWords();
				break;
			case 7:
				search();
				break;
			case 8:
				middle();
			case 9:
				System.out.println("Thank you -Goodbye!");
				break;
				
			default:
				System.out.println("Please enter a number between 1-7");
				break;
			}
			
		}while(input != 9);
	}
	public static void surname()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String surname;
		int length;
		int space;
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		name = name + " ";
		surname = name.substring(space, name.length());
		System.out.println("Your surname is " + surname);
		
	}
	public static void firstname()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String firstname;
		int space;
	
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		firstname = name.substring(0,space);
		System.out.println("Your firstname is " + firstname);
	}
	public static void count()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int length;
		
		name = Input.nextLine();
		length = name.length();
		System.out.println("The number of characters entered is " + length);
	}
	public static void upper()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		int count = 0;
		int index;
		char current;
		char current2;
		
		name = Input.nextLine();
		for (index = 0; index < name.length();index++)
		{
			current = name.charAt(index);
			current2 = Character.toUpperCase(current);
			if(current != ' ')
			{
			if(current == current2)
			{
				count++;
			}
			}
		}
		System.out.println("The amount of upper case characters in the given String is " + count);
	}
	public static void reverse()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String backwards = "";
		char letter;
		int index;
		int length;
		int length2;
		int count;
		
		name = Input.nextLine();
		length = name.length();
		length2 = length;
		for (index =0;index < length; index++)
		{
			
			letter = name.charAt(length2 - 1);
			backwards = backwards +letter;
			length2 --;
		}
		System.out.println("The words backwards is "  + backwards);
	}
	public static void revWords()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		String firstname;
		String surname;
		String newName;
		int space;
	
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		firstname = name.substring(0,space);
		surname = name.substring(space);
		newName = surname + " " + firstname;
		System.out.println("Your new Name is " + newName);
	}
	public static void search()
	{
		Scanner Input = new Scanner(System.in);
		
		String name;
		char letter;
		char letter2;
		int index;
		int count = 0;
		int length;
		
		name = Input.nextLine();
		letter2 = Input.next().charAt(0);
		length = name.length();
		for(index = 0; index < length -1; index++)
		{
			letter = name.charAt(index);
			if((letter == letter2) || (letter == letter2))
			{
				count++;
			}
					
		}
		System.out.println("The amount of times the letter " + letter2 + " was entered is " + count);
	}
	public static void middle()
	{
		Scanner Input = new Scanner(System.in);
		
		String first;
		String last;
		int index;
		String name;
		int space;
		
		name = Input.nextLine();
		space = name.indexOf(" ");
		first = name.substring(0 ,space);
		space = name.lastIndexOf(" ");
		last = name.substring(space, name.length());
		name = first + last;
		System.out.println("The name with the first and last surname only is " + name);
		
	}
}