//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE:	Inputs a number between 1-12 and outputs corresponding month
package JLab2b;
import java.util.*;
public class JLab2b_q5 
{
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		
		int input;
		
		System.out.println("Please input a number between 1-12 and this program will give you the corresponding month");
		
		input = Input.nextInt();
		
		switch(input)
		{
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;		
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}
		
	}
}
