//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: convert celcius to fahrenheit
package JLab0;
import java.util.Scanner;
public class JLab0_q2 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double Celcius = 0;
		double F = 0;
		
		System.out.println("Please input a value in Fahrenheit and this program will give you the Celcius equivalent");
		F = Input.nextDouble();
		Celcius = (F-32) * 5/9;
		System.out.println("The Celcius equivalent is " + Celcius);
	}
}
