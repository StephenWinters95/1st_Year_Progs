//NAME: STEPHEN WINTERS 
//DATE: 14/06/21
//PURPOSE: finds largest smallest and average in a range of inputs
package JLab3;
import java.util.*;
public class JLab3_q6
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		double value;
		double largest = -999999999;
		double smallest = 999999999;
		double average = 0;
		double total = 0;
		double count = 1;
		double larCount = 1;
		double smaCount = 1;
		
		System.out.println("Please input a range of values and this program will tell you the highest, lowest and average values");
		
		do
		{
			value = Input.nextDouble();
			total = total + value;
			if(value != 0)
			{
			if(value > largest)
			{
				largest = value;
				larCount = 1;
			}
			else if(value == largest)
			{
				larCount++;
			}
			if(value < smallest)
			{
				smallest = value;
				smaCount = 1;
			}
			else if (value == smallest)
			{
				smaCount++;
			}
			}
			
			
			average = total/count;
			count ++;
			
			System.out.println("The current smallest number found: " + smallest + ". The current largest number found: " + largest);
			System.out.println("The current average value entrered: " + average + ".");
		}while(value != 0);
		
		System.out.println("The smallest number found was " + smallest + " The amount of times it was entered was " + larCount + ".");
		System.out.println("The largest number found was " + largest + ". The amount of times it occured is " + smaCount + ".");
		System.out.println("The average value entrered was " + average + ".");
	}
	
}
