//NAME: STEPHEN WINTERS 
//DATE: 05/06/21
//PURPOSE: Takes in a sentence then gives you the statistics, longest word(word is anything without a number
// - number of valid words, the valid words, word with most vowels, largest number of consonants, 
// - shortest word with equal number of vowels and consonants.
package JLab11;
import java.util.*;
public class JLab11_q1 
{
	public static void main(String []args)
	{
		Scanner Input = new Scanner(System.in);
		
		String sentence;
		String newSentence = "";
		String word;
		int index;
		int longest = 0;
		String Longest;
		int vowels = 0;
		String Vowels = "  ";
		int wordCount = 0;
		int space;
		int begining = 0;
		int nextSpace = 0;
		
		sentence = Input.nextLine();
		sentence =  " " + sentence + " ";
		space = sentence.length();
		System.out.println(space);
		space = sentence.lastIndexOf(" ");
		
		do 
		{
		nextSpace = sentence.lastIndexOf(" ",space);
		word = sentence.substring(nextSpace,space + 1);
		if(isWord(word))
		{
			wordCount++;
			newSentence = word + " " + newSentence;

			if(word.length() >= longest)
			{
				longest = word.length();
				Longest = word;
			}
			int vowelCount = vowels(word);
			if(vowelCount >= vowels)
			{
				Vowels = word;
			}
		}
		
		space = nextSpace -1;
		}while(nextSpace != 0);
		wordCount--;
		
		System.out.println(" The number of valid words are " + wordCount);
		System.out.println(" The valid words enetered were " + newSentence);
		System.out.println(" The word with the largest number of vowels is " + Vowels);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
	}
	public static boolean isWord(String word)
	{
		int index;
		int length;
		char the;
		boolean ans = true;
		length = word.length();
		
		for(index =0;index < length; index++)
		{
			the = word.charAt(index);
			if((the == '0' || the == '1') || (the == '2' || the == '3'))
			{
				ans = false;
			}
			if((the == '4' || the == '5') || (the == '6' || the == '7'))
			{
				ans = false;
			}
			if(the == '8' || the == '9')
			{
				ans = false;
			}
		}
		return ans;
	}
	public static int vowels(String word)
	{
		int index= 0;
		int count=0;
		int length = 0;
		char the;
		
		length = word.length();
		
		for(index=0;index < length; index++)
		{
			the = word.charAt(index);
			if((the == 'a' || the == 'e') || (the == 'i' || the == 'o'))
			{
				count++;
			}
			if(the == 'u')
			{
				count ++;
			}
		}
		return count;
	}
	
}
