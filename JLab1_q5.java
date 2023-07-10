//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: Enter loan amount and interest rate and number of years the loan is for

package JLab1;

import java.util.*;

public class JLab1_q5 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double amount;
		double years;
		double rate;
		double ATR;
		double AtrTY;

		System.out.println("Enter the loan amount");
		amount = Input.nextDouble();
		System.out.println("Enter the years");
		years = Input.nextDouble();
		System.out.println("Enter the interest rate");
		rate = Input.nextDouble();
		
		ATR = (amount * (rate + 1)) - amount;
		System.out.println(ATR);
		AtrTY = ATR * years;
		System.out.println("The total amount payable is" + (AtrTY + amount));
		
		
		
	}
}
