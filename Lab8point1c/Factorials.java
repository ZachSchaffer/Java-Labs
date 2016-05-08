//**** ORIGINALS ********************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
//************************************************************

class Factorials
{
    public static void main(String[] args) throws IllegalArgumentException
    {
	char keepGoing = 'y';

	while (keepGoing == 'y' || keepGoing == 'Y')
	    {
	    	try
	    	{
	    		int val = GetInfo.getInt("Enter an integer: ");
	    		if(val<0 || val>16)
	    		{
	    			
	    			if(val<0)
	    			{
	    				keepGoing = 'n';
	    				throw new IllegalArgumentException("Value cannot be negative");
	    				
	    			}
	    			else
	    			throw new IllegalArgumentException("Value is too high (must be less than 16)");
	    			
	    			
	    		}
				else
				GetInfo.showMessage("Factorial(" + val + ") = " + MathUtils.factorial(val));

				keepGoing = GetInfo.getChar("Another factorial? (y/n) ");

	    	}
	    	catch (IllegalArgumentException err)
	    	{
	    		GetInfo.showMessage(""+err);
	    	}
	
	
	    }
    }
}
