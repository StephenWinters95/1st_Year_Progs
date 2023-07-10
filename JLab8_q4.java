//NAME: STEPHEN WINTERS 
//DATE: 30/06/21
//PURPOSE:	game of X's and O's;
package JLab8;
import java.util.*;
public class JLab8_q4 
{
	public static void main(String[] args)	 
    {
    	Scanner input= new Scanner (System.in);
    	String[] Moves = new String[9];
    	
    	int choice;
    	int XRO;
    	int index;
    	int count = 1;
    	String WinX = "N";
    	String WinY ="N";
    	
    	for(index = 0; index < Moves.length; index++)
    	{
    		Moves[index] = " ";
    	}
    	do
    	{ 
    	System.out.println(Moves[0] + "|" + Moves[1] + "|" + Moves[2] + "   " + "1|2|3");
    	System.out.println(Moves[3] + "|" + Moves[4] + "|" + Moves[5] + "   " + "4|5|6");
    	System.out.println(Moves[6] + "|" + Moves[7] + "|" + Moves[8] + "   " + "7|8|9");
    	
    	System.out.println("please enter a number between 1-9 to choose a space between the gaps");
    	choice = input.nextInt();
    	choice = choice -1;
    	Moves[choice] =drawBoard(Moves[choice],count);
    	count++;
    	
    	WinX = checkWinX(WinX, Moves);
    	if(WinX == "Y")
    	{
    		choice = 99;
    		System.out.println("X has WON the game");
    	}
    	WinY = checkWinY(WinY, Moves);
    	if(WinY == "Y")
    	{
    		choice = 99;
    		System.out.println("O's have WON the game");
    	}
    	}while(choice != 99);
    	
    	if(WinY == "Y" || WinX == "Y")
    	{
    	System.out.println(Moves[0] + "|" + Moves[1] + "|" + Moves[2]);
    	System.out.println(Moves[3] + "|" + Moves[4] + "|" + Moves[5]);
    	System.out.println(Moves[6] + "|" + Moves[7] + "|" + Moves[8]);
    	}
    }
    public static String drawBoard(String turn, int Count)
    {
    	if(Count % 2 == 1)
    	{
    		turn = "X";
    	}
    	else
    	{
    		turn = "O";
    	}
    	return turn;
    }
    public static String checkWinX(String Win,String[] Moves )
    {
    	String X ="X";
    	if(Moves[0] == X && Moves[1] == X && Moves[2] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[3] == X && Moves[4] == X && Moves[5] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[6] == X && Moves[7] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[0] == X && Moves[3] == X && Moves[6] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[1] == X && Moves[4] == X && Moves[7] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[2] == X && Moves[5] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[0] == X && Moves[4] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[0] == X && Moves[4] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[2] == X && Moves[4] == X && Moves[6] == X)
    	{
    		Win = "Y";
    	}
    	return Win;
    }
    public static String checkWinY(String Win, String[] Moves)
    {
    	String X ="O";
    	if(Moves[0] == X && Moves[1] == X && Moves[2] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[3] == X && Moves[4] == X && Moves[5] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[6] == X && Moves[7] == X&& Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[0] == X&& Moves[3] == X && Moves[6] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[1] == X && Moves[4] == X && Moves[7] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[2] == X && Moves[5] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[0] == X && Moves[4] == X && Moves[8] == X)
    	{
    		Win = "Y";
    	}
    	if(Moves[2] == X && Moves[4] == X && Moves[6] == X)
    	{
    		Win = "Y";
    	}
    	return Win;
    }
}
