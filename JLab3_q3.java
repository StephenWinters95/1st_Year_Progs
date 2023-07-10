//NAME: STEPHEN WINTERS 
//DATE: 14/06/21
//PURPOSE:  finds the first and last index of the number 12 when a number of integers are entered into the 
package JLab3;
import java.util.*;
public class JLab3_q3 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int input;
		int first = 0;
		int last = 0;
		int count = 1;
		
		do
		{
			input = Input.nextInt();
			if(input == 12)
			{
				first = count;
				last = count;
			}
			count++;
			
		}while (input != 12);
		do 
		{
			input = Input.nextInt();
			if(input == 12)
			{
				last = count;
			}
			count++;
			
		}while(input != 0);
		
		System.out.println("The first occurence is at index " + first + " The last occurence was at index " + last + ".");
		
	}
}
