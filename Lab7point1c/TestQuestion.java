// ****************************************************************

// TestQuestion.java

// ****************************************************************
import java.util.ArrayList;


public abstract class TestQuestion

{

    protected String question;
	int size1;    
	
	

    //-----------------------------------------------------------------------

    // Constructor -- INPUT the question  here in the driver.

    //-----------------------------------------------------------------------

    public  TestQuestion()

    {

            question = GetInfo.getString("INPUT the Question here: ");
           
    }

    //-------------------------------------------------------------------------------------------------------------------------------------

    //  Abstract Method  -  Used in the children to read questions stored in an array in the driver program.

    //-------------------------------------------------------------------------------------------------------------------------------------

    protected abstract String getQuestionFromArray();
 	public abstract void tostring();
 
}