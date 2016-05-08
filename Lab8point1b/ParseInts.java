//**** ORIGINAL ******************************************
// ParseInts.java  --  Reads a line of text and prints the integers in the line.  
//********************************************************
import java.util.*;
public class ParseInts
{
    public static void main(String[] args)
    {
	int val, sum=0;
	StringTokenizer toks = new StringTokenizer(GetInfo.getString("Enter a line of text"));
	

		while (toks.hasMoreTokens())
	    {	
	   	 try
	    	{
	    	val = Integer.parseInt(toks.nextToken());
			sum += val;
	   		}		
		catch (NumberFormatException exc) {}
	    }
	

	
	GetInfo.showMessage("The sum of the integers on this line is " + sum);
    }
}
