public class Essay extends TestQuestion
    {
    	int blanks;
    	
    	public Essay (int nbrofBlanks)
    	{
    		super();
    		blanks = nbrofBlanks;
    	}
    	
    	public String getQuestionFromArray()
    	{
    		return question;
    	}
    	
    	public void tostring()
    	{
    		String work = "\n"+getQuestionFromArray()+"\n";
    		String lines ="";
    		for (int i =0;i<blanks;i++)
    		{
    			lines += "________________________________________\n"; 
    		}
    		
    	//	work += question + lines;
    	work += lines;
    	
    	System.out.println(work+"\n");
    	}
    }