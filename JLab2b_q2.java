//NAME: STEPHEN WINTERS 
//DATE: 13/06/21
//PURPOSE:  calculate loan, input 12% on first 500 and 18% on everything after
package JLab2b;
import java.util.*;
public class JLab2b_q2 
{
	public static void main(String[]args)
	{
		Scanner Input = new Scanner(System.in);
		
		double input;
		double total;
		double add = (500 * 0.12);
		
		System.out.println("Please input the loan amount and this prgram will give you your total");
		
		input = Input.nextDouble();
		if (input > 500)
		{
			total = input + ((input - 500) * 0.18) + add;
		}
		else
		{
			total = input + (input * 0.12);
		}
		System.out.println(total);
	}
}
