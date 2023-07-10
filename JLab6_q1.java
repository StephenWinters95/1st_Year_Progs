//NAME: STEPHEN WINTERS 
//DATE: 24/06/21
//PURPOSE: method called is Even returns boolean if input number is true
package JLab6;
import java.util.*;
public class JLab6_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		int num;
		boolean answer;
		
		num = Input.nextInt();
		answer = isEven(num);
		System.out.println("The number being even is " + answer);
	}
	public static boolean isEven(int num)
	{
		if(num % 2 == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
