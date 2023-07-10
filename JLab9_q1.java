//NAME: STEPHEN WINTERS 
//DATE: 30/06/21
//PURPOSE: Lotto draw with the range of numbers the amount of numbers drawn and how many times
package JLab9;
import java.util.*;
public class JLab9_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		Random rand = new Random();
		int index;
		int index2;
		int amount;
		int drawn;
		int selections;
		int random;
		int numbers[];
		int numDrawn[];
		
		System.out.println("Please input the amountof numbers you would like in the lotto");
		amount = Input.nextInt();
		System.out.println("Please input the amount of numbers drawn for each selection");
		drawn = Input.nextInt();
		System.out.println("Please input the amount of selections you would like to include");
		selections = Input.nextInt();
		numbers = new int[drawn];
		numDrawn = new int[drawn];
		
		for(index2 = 0; index2 < selections +1; index2++)
		{
			for (index = 0; index < drawn; index++)
			{
			random = rand.nextInt(amount -1);
			numbers[index] = random;
			}
			if(index2 ==0)
			{
				numDrawn = numbers;
				System.out.print("Numbers Drawn:");
			}
		
		for (index = 0; index < drawn; index++)
		{
			System.out.print(numbers[index] + ",");
		}
		System.out.println("");
		
		}
		
	}
}












