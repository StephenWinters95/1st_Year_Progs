//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: input 2 numbers and tells if the first is divisible by the second

package JLab2;
import java.util.*;
public class JLab2_q4 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		double num1;
		double num2;
		double result;
		
		System.out.println("Input first number");
		num1 = Input.nextDouble();
		System.out.println("Input second number");
		num2 = Input.nextDouble();
		result  = num1 % num2;
		if (result == 0)
		{
			System.out.println("The first number is exactly divisible by the second number");
		}
		else
		{
			System.out.println("The first number is not divisible by the second number");
		}
	}
}
