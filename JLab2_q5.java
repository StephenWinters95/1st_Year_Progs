//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: takes in 3 numbers and tells if the first is divisible by the second or third or both or neither
package JLab2;
import java.util.*;
public class JLab2_q5 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		
		System.out.println("Please input three numbers");
		
		num1 = Input.nextDouble();
		num2 = Input.nextDouble();
		num3 = Input.nextDouble();
		
		if ((num1 % num2 == 0) && (num1 % num3 == 0))
		{
			System.out.println("The first number entered is exactly divisible by the second and third number");
		}
		else if(num1 % num2 == 0)
		{
			System.out.println("The first number is exactly divisible by the second number");
		}
		else if(num1 % num3 == 0)
		{
			System.out.println("The first number is exactly divisible by the third number");
		}
		else
		{
			System.out.println("The first number is not divisible by the second or third number");
		}
		
		
	}
}
