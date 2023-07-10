//NAME: STEPHEN WINTERS 
//DATE: 29/06/21
//PURPOSE: Takes in an Array of String and outputs each on on a seperate line telling you if its a palindrome,and now counts the amount
package JLab7;
import java.util.*;
public class JLab7_q7 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		String words[];
		int index;
		int index2;
		int index3;
		int count = 0;
		int volume;
		boolean ans = true;
		
		
		System.out.println("How many words would you like to be checked for a palindrome?");
		volume = Input.nextInt();
		Input.nextLine();
		words = new String[volume];	
		                   
		for(index = 0; index < volume; index++)
		{
			words[index] = Input.nextLine();
		}
		
		for(index=0; index < volume; index++)
		{
			index3 = words[index].length();
			for(index2 = 0; index2 <= index3; index2++)
			{
				if(words[index].charAt(index2) != words[index].charAt(index3 -1))
				{
					ans = false;
				}
				index3--;
			}
			System.out.println("The word " + words[index] + " being a palindrome is " + ans);
			if(ans == true)
			{
				count++;
			}
			ans = true;
		}
		System.out.println("The amount of palindromes entered was " + count);
	}
}
