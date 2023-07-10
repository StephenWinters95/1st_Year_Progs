//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: takes miles,time and gallons and outputs avergage miles per hour + hours per gallon;
package JLab1;

import java.util.*;

public class JLab1_q2 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double Miles;
		double Hours;
		double Gallons;
		double mph;
		double HPG;
		
		System.out.println("Please enter the amont of Miles travelled now:");
		Miles = Input.nextDouble();
		System.out.println("Please enter the amount of time travelled in hours:");
		Hours = Input.nextDouble();
		System.out.println("Please enter the amount of fuel used in Gallons:");
		Gallons = Input.nextDouble();
		
		mph = Miles/Hours;
		HPG = Miles/Gallons;
		
		System.out.println("The average miles per hour is " + mph + "mph");
		System.out.println("The Miles per Gallon is " + HPG + "L");
		
		
	}
}
