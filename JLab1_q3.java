//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: takes 3 numbers, outputs there sum, product and average
package JLab1;

import java.util.*;

public class JLab1_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double average;
		double sum;
		double product;
		
		System.out.println("Input 3 numbers and this program will output there sum, product and average");
		
		num1 = Input.nextDouble();
		num2 = Input.nextDouble();
		num3 = Input.nextDouble();
		
		sum = (num1 + num2 + num3);
		product = (num1 * num2 * num3);
		average =  sum / 3;
		
		System.out.println("Sum : " + sum + "Product : " + product + "Average : " + average);
		
	}
}