//NAME: STEPHEN WINTERS 
//DATE: 26/06/21
//PURPOSE: method that tells you the 
package JLab6;
import java.util.*;
public class JLab6_q4 
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		String grade;
		int mark;
		
		System.out.println("Please input your mark now and this program will tell you your grade");
		mark = Input.nextInt();
		grade = award(mark);
		System.out.println("The level of award for your mark is " + grade);
		
	}
	public static String award(int mark)
	{
		if(mark >= 70)
		{
			return "Distinction";
		}
		else if(mark >= 63)
		{
			return "Merit1";
		}
		else if(mark >= 52)
		{
			return "Merit2";
		}
		else if(mark >= 40)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
}






