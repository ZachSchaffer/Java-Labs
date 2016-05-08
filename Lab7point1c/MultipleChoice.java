import java.util.ArrayList;

 public class MultipleChoice extends TestQuestion 
    {
    boolean across = false;
    boolean vertical = false;
    int size1;
    int bool;
    
    	public MultipleChoice (int size)
    	{
				super();
    			ArrayList mchoice = new ArrayList(size);
    			size1 = size;	                                                       
    	}
    	
    	public String getQuestionFromArray()
    	{
    		return question;
    	}
    	//you need to make a separate method for the thing you goof
    	
    	public void verifyPos(int i)
    	{
    		if(i == 0)
    		{
    			bool = 0;
    		}
    		
    		if(i == 1)
    		{
    			bool =1;
    		}
    	}
    
    	
    	public void tostring()
    	{

		    across = false;
    		vertical = false;

    		String work = "\n"+getQuestionFromArray()+"\n\n";
    		String lines ="";
    		
    		if(bool == 1)
    		for (int i =0;i<size1;i++)
    		{
    		String answer =	GetInfo.getString("Enter the multiple choice option for "+(i+1));
    		work+= (i+1)+")"+answer+"\t ";
    		}
    		
    		if(bool == 0)
    		for (int i =0;i<size1;i++)
    		{
    			String answer =	GetInfo.getString("Enter the multiple choice option for "+(i+1));
    			work+= (i+1)+")"+answer+"\n";
    			
    			
    		}
    		
    		
    		work += lines;
    		
    		System.out.println(work+"\n");
    		
    		
    	}
    	
    	public void makeVertical()
    	{
    		vertical = true;
    	}
    	
    	public void makeHorizontal()
    	{
    		across = true;
    	}
    		
    }