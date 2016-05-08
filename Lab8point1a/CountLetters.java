//************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of 
// occurrences of each letter in that word.
//          
//************************************************************

public class CountLetters 
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
	int[] counts = new int[26];

	//get word from user
	String word = GetInfo.getString("Enter a single word (letters only, please): ");

	//convert to all upper case
	word = word.toUpperCase();

	//count frequency of each letter in string
	try
	{
		for (int i=0; i < word.length(); i++)
		{
			if(word.charAt(i)-'A' > 25 || word.charAt(i)-'A' < 0)
			{
				throw new ArrayIndexOutOfBoundsException("\""+word.charAt(i)+"\""+" is not a valid character");
			}
			else	   
 			counts[word.charAt(i)-'A']++;
		}
	}
		catch (ArrayIndexOutOfBoundsException exc)
		{
			System.err.println(exc);
		}
	
	

	//print frequencies
	System.out.println();
	for (int i=0; i < counts.length; i++)
	{
	    if (counts [i] != 0)
		{
			System.out.println((char)(i +'A') + ": " + counts[i]);
		}	
	}

    }
}
