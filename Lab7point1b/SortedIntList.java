


public class SortedIntList extends IntList
{

    public SortedIntList(int size) 
    {
    	super(size);
    }
      
    
   
    
     public String toString()
    {
	 String work ="\n";
	int minIndex;
	for (int i=0; i < list.length-1; i++)
	    {
		//find smallest element in list starting at location i
		minIndex = i;
		for (int j = i+1; j < list.length; j++)
		    if (list[j] < list[minIndex])
			    minIndex = j;

		//swap list[i] with smallest element
		int temp = list[i];
		list[i] = list[minIndex];
		list[minIndex] = temp;
	    }

    
	    
	    for (int i = 0; i < list.length; i++)
	    {
	    	work = work+"\n"+i+":" +list[i];
	    }
	    
	    
		return work;
    }
    
    
    
}