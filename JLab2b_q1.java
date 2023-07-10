//NAME: STEPHEN WINTERS 
//DATE: 13/06/21
//PURPOSE: Calculate insurance premium,asks for previous years premium, 5% increase, 40% decrease for no claims, 20% increase for each claim.
package JLab2b;
import java.util.*;

public class JLab2b_q1
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double premium;
		double claims;
		double ans;
		
		System.out.println("Enter your pervious years insurance premium");
		premium = Input.nextDouble();
		System.out.println("Enter the amount of insurance claims this year");
		claims = Input.nextDouble();
		
		ans = premium + (premium *.05);
		if (claims == 0)
		{
			ans = ans - (ans * .4);
		}
		else 
		{
			ans = ans + (ans * (claims * .2));
		}
		System.out.println(ans);
	}
}
