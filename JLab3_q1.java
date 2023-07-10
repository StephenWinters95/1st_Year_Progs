//NAME: STEPHEN WINTERS 
//DATE: 13/06/21
//PURPOSE: Menu system same as one in last program but with loop (exact same as last prgram, copy/paste)
package JLab3;
import java.util.*;
public class JLab3_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int input;
		double Fahren;
		double Celcius;
		double Inch;
		double Cent;
		double pound;
		double kilogram;
		
		do
		{
			
		System.out.println("**********************************************");
		System.out.println("* Please select one of the following options *");
		System.out.println("* 1.Convert Fahrenheit to celcius:           *");
		System.out.println("* 2.Convert Celcius to Fahrenheit:           *");
		System.out.println("* 3.Convert Inches to Centimeters:           *");
		System.out.println("* 4.Convert Centimeters to Inches:           *");
		System.out.println("* 5.Pounds to Kilograms:                     *");
		System.out.println("* 6.Kilograms to Pounds:                     *");
		System.out.println("* 7. Exit Program:                           *");
		System.out.println("**********************************************");
		input = Input.nextInt();
		switch(input)
		{
		case 1:
			System.out.println("Please input a Fahrenheit value to be converted to Celcius");
			Fahren = Input.nextDouble();
			Celcius = (Fahren - 32) *5/9;
			System.out.println("The Celcius equivalent is " + Celcius);
			break;
		case 2:
			System.out.println("Please input a Celcius value to be converted to Fahrenherit");
			Celcius = Input.nextDouble();
			Fahren = (Celcius * 9 / 5) + 32;
			System.out.println("The Fahrenhiet equivalent is " + Fahren);
			break;
		case 3:
			System.out.println("Please input a value in Inches to be converted to Centimeters");
			Inch = Input.nextDouble();
			Cent = Inch * 2.54;
			System.out.println("The Centimeter equivalent is " + Cent);
			break;
		case 4:
			System.out.println("Please input a value in Centimeters to be converted to Inches");
			Cent = Input.nextDouble();
			Inch = Cent/ 2.54;
			System.out.println("The inches equivalent is " + Inch);
			break;
		case 5:
			System.out.println("Please input a value in Pounds to be converted to Kilograms");
			pound = Input.nextDouble();
			kilogram = pound/2.2;
			System.out.println("The kilogram equivalent is " + kilogram);
			break;
		case 6:
			System.out.println("Please input a value in Kilograms to be converted to Pounds");
			kilogram = Input.nextDouble();
			pound = kilogram * 2.2;
			System.out.println("The pound equivalent is " + pound);
		case 7:
			System.out.println("Thank you -Goodbye!");
			
			break;
		
		default:
			System.out.println("Please enter a number between 1-7");
			break;
			
		}
		}while (input != 7);
	}
}
