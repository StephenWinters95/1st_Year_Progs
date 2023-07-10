//NAME: STEPHEN WINTERS 
//DATE: 27/06/21
//PURPOSE: menu system with conversion options, conversions are independant methods 
package JLab6;
import java.util.*;
public class JLab6_q5 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		int input;
		
		
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
				farToCel();
				break;
			case 2:
				celToFar();
				break;
			case 3:
				inchToCent();
				break;
			case 4:
				centToInch();
				break;
			case 5:
				poundToKilo();
				break;
			case 6:
				kiloToPound();
				break;
			case 7:
				System.out.println("Thank you -Goodbye!");
				break;
				
			default:
				System.out.println("Please enter a number between 1-7");
				break;
				
			}
			
		}while(input != 7);
		
	}
	public static void farToCel()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a Fahrenheit value to be converted to Celcius");
		Double Fahren = Input.nextDouble();
		Double Celcius = (Fahren - 32) *5/9;
		System.out.println("The Celcius equivalent is " + Celcius);
	}
	public static void celToFar()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a Celcius value to be converted to Fahrenherit");
		Double Celcius = Input.nextDouble();
		Double Fahren = (Celcius * 9 / 5) + 32;
		System.out.println("The Fahrenhiet equivalent is " + Fahren);	
	}
	public static void inchToCent()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a value in Inches to be converted to Centimeters");
		Double Inch = Input.nextDouble();
		Double Cent = Inch * 2.54;
		System.out.println("The Centimeter equivalent is " + Cent);
	}
	public static void centToInch()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a value in Centimeters to be converted to Inches");
		Double Cent = Input.nextDouble();
		Double Inch = Cent/ 2.54;
		System.out.println("The inches equivalent is " + Inch);
	}
	public static void poundToKilo()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a value in Pounds to be converted to Kilograms");
		Double pound = Input.nextDouble();
		Double kilogram = pound/2.2;
		System.out.println("The kilogram equivalent is " + kilogram);
	}
	public static void kiloToPound()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Please input a value in Kilograms to be converted to Pounds");
		Double kilogram = Input.nextDouble();
		Double pound = kilogram * 2.2;
		System.out.println("The pound equivalent is " + pound);
	}
}
