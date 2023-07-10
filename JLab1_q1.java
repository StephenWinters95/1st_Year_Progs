//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: Convert Inches to Centimeter
package JLab1;

import java.util.*;
public class JLab1_q1
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner (System.in);
		
		double Iput;
		double Output;
		
		System.out.println("Please input value in inches now : ");
		Iput = Input.nextDouble();
		Output = Iput * 2.54;
		System.out.println("The centimeter equivalence is " + Output);
	}
}
