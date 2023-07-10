//NAME: STEPHEN WINTERS 
//DATE: 14/06/21
//PURPOSE: Counts the sum of inputs

package JLab3;
import java.util.*;
public class JLab3_q2 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int input;
		int total = 0;
		
		do
		{
			input = Input.nextInt();
			total = total + input;
			
		}while(input != 0);
		System.out.println(total);
		
	}
}
