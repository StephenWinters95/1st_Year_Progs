//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: takes miles,time and gallons and outputs avergage miles per hour + hours per gallon and update aftr each number is entered;
package JLab1;
import java.util.*;
public class JLab1_q4 {

	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double[] array;
		double num1;
		double num2;
		double num3;
		double average;
		double sum;
		double product;
		array = new double[3];
		
		System.out.println("Input 3 numbers and this program will output there sum, product and average");
		
		for (int index = 0; index <= 3; index++)
		{
			array[index] = Input.nextDouble();
			
			sum = (array[0] + array[2] + array[1]);
			product = (array[0] * array[1] * array[2]);
			average =  sum / (index+1);
			
			System.out.println("Sum : " + sum + "Product : " + product + "Average : " + average);
		}
	}
}
