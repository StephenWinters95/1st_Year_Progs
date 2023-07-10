//NAME: STEPHEN WINTERS 
//DATE: 13/06/21
//PURPOSE: Enters 3 numbers and program outputs lowest
package JLab2b;
import java.util.*;
public class JLab2b_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int lowest;
		
		System.out.println("Input 3 numbers and this program will tell you the lowest");
		
		num1 = Input.nextInt();
		num2 = Input.nextInt();
		num3 = Input.nextInt();
		
		lowest = num1;
		if(num1 > num2)
		{
			lowest = num2;
		}
		else if(num1 > num3)
		{
			lowest = num3;
		}
		System.out.println(lowest);
	}
}
