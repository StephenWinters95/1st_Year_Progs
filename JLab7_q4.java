//NAME: STEPHEN WINTERS 
//DATE: 28/06/21
//PURPOSE: input an array of chars and this program will tell you the amoun tof vowels and consonants
package JLab7;
import java.util.*;
public class JLab7_q4 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		char array[];
		array = new char[5];
		int index;
		int vowels = 0;
		
		for(index =0;index < 5;index++)
		{
			System.out.println("Please input char");
			array[index] = Input.next().charAt(0);
			if((array[index] == 'a') || (array[index] == 'A'))
			{
				vowels++;
			}
			if((array[index] == 'e') || (array[index] == 'E'))
			{
				vowels++;
			}
			if((array[index] == 'i') || (array[index] == 'I'))
			{
				vowels++;
			}
			if((array[index] == 'o') || (array[index] == 'O'))
			{
				vowels++;
			}
			if((array[index] == 'u') || (array[index] == 'U'))
			{
				vowels++;
			}
		}
		System.out.println("The amount of vowels and consonants in the array of chars was " + vowels);
		
	}
}
