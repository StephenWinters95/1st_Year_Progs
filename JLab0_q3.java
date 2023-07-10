//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: Calculate Tax 
package JLab0;
import java.util.*;
public class JLab0_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		double income;
		double tax = 0;
		double welps;
		double result;
		
		
		
		System.out.println("Input income now :");
		income = Input.nextDouble();
		System.out.println("Input Number of children now :");
		welps = Input.nextDouble();
		result = income - (welps * 1000);
		result = result - 5000;
		if(result > 0)
		{
			tax = result * 0.24;
		}
		System.out.println("The amount of tax due is: " + tax);
			
	}
	

}
