//NAME: STEPHEN WINTERS 
//DATE: 22/06/21
//PURPOSE: inputs String outputs the number of words with min max and average characters;

package JLab5;

import java.util.Scanner;

public class JLab5_q3 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String name;			//string input by user
		String sub;
		int chars = 0;
		int min = 9999999;
		int max = -9999999;
		int count = 0;			//count the amount of words
		int index;
		int space = 0;			//the space between the count and the next word
		int space2;
		int nextSpace;
		int average;
		
		System.out.println("Please input a String now and this program will tell you the amount of words ");
		name = Input.nextLine();
		name = " " + name + " ";
		space = name.indexOf(" ");
		space2 = name.lastIndexOf(" ");
		do
		{
			
		nextSpace = name.lastIndexOf(" ",space2);
		sub = name.substring(nextSpace, space2);
		chars = chars + sub.length();
		if(sub.length()  < min)
		{
			min = sub.length();
		}
		if(sub.length() > max)
		{
			max = sub.length();
		}
		space2 = nextSpace;
		space2--;
		count++;
		average = chars/count;
				
		}while(nextSpace != space);
		System.out.println("The total word count is " + count);
		System.out.println("The average amount of characters per word is "+ average);
		System.out.println("The smallest amount of characters in a word was " + min);
		System.out.println("The largest amount of characters ina word is  "  + max);
		
	}
}
