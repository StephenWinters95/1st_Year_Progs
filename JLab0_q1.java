//NAME: STEPHEN WINTERS 
//DATE: 08/06/21
//PURPOSE: SMAPLE MULTIPLICATION
package JLab0;

import java.util.*;
public class JLab0_q1
	//	class Addition
	//
	// A Simple program that adds two numbers entered from the keyboard
	// 
	{  
	 public static void main(String args[])
	    {
		Scanner Input = new Scanner(System.in);
	  	int number1;
		int number2;
		int answer;

		System.out.print("Enter the first number ->  ");
	        	number1 = Input.nextInt();
	        	System.out.print("Enter the second number ->  ");
	        	number2 = Input.nextInt();
	        	answer = number1 + number2 ;
	        	System.out.println("The sum of the two numbers is " + answer) ;
	        }
	}