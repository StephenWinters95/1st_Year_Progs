//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: input 3 grades and the program will out what mark you got on average

package JLab2;

import java.util.*;

public class JLab2_q2 
{
	public static void main(String []agrs)
	{
		Scanner Input = new Scanner(System.in);
		double Hard;
		double Soft;
		double Maths;
		double average;
		
		System.out.println("Please input your grade for Hardware");
		Hard = Input.nextDouble();
		System.out.println("Please iput your grade for Software");
		Soft = Input.nextDouble();
		System.out.println("Please input your grade for Maths");
		Maths = Input.nextDouble();
		
		average = (Soft + Maths + Hard)/3;
		
		
		
		if(average >= 70)
		{
			System.out.println("Your average mark is a Distinction");
		}
		else if(average >= 63 && average <= 69)
		{
			System.out.println("Your average mark is a merit 1");
		}
		else if (average >= 55 && average <= 62)
		{
			System.out.println("Your average mark is a merit 2");
		}
		else if(average >= 40 && average <= 54)
		{
			System.out.println("Your average mark is a pass");
		}
		else
		{
			System.out.println("Your average mark is a fail");
		}
		
	}
}
