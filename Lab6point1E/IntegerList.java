 
// ***** LAB6POINT1E *********************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************

public class IntegerList{

    int[] list; //values in the list
	int xsize;
	int[] temp;


    //-------------------------------------------------------
    //CONSTRUCTOR - create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
    xsize = size;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;
    }


    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	String myString = new String("");
	String myDetail;

	for (int i=0; i<list.length; i++)
		{	
	    	myDetail = new String(i + ":\t" + list[i] + "\n");
	    	myString = myString + myDetail;
		}
    
	    myString = myString + ("\n");
    
    
        GetInfo.showMessage(myString);
    }


    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
	int location = -1;
	for (int i=0; i<list.length && location == -1; i++)
	    if (list[i] == target)
		location = i;
	return location;
    }


    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
	 
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

		this.print();
    }
    
	public void increaseSize()
	{
		temp = new int[list.length +1];
		for(int x = 0; x < list.length; x++)
		{
			temp[x] = list[x];
		}
		list = temp;	
	}
	
	public void addElement(int newVal)
	{
		
		int length = list.length;
		increaseSize();
		
		list[length] = newVal;
		selectionSort();
			
	}
	
    public void removeFirst(int target)
    {
    	int location = list.length;
    	
    	for(int i = 0; i<list.length; i++)
    	{
    		if(list[i] == target)
    		{
    			list[i] = 999;
    			location = i;
    		}
    	}
    	
    	int z;
    	z = location + 1;
    	
    	//move over 
    	for (int i = z; i<list.length;i++)
    	{ 
    			list[i - 1] = list[i];	
    	}
    	
    //	list[list.length - 1] = 999; 
    }
    
    	
			
	public void removeAll(int target)
	{
	int location = -1;
	int count = 0;
	int firstloc = 0;
	int z;
    	
	for(int y = list.length - 1; y>0; y--)
	{
    	
    	for(int i = 0; i<list.length; i++)
    	{
    		if(list[i] == target)
    		{
    		list[i] = 999;
    		location = i;
    		for (int x = location+1; x<list.length;x++)
    	{ 
    			list[x - 1] = list[x];	
    	}
    	
     
    			
    		}
    			
    	}
    	list[list.length - 1] = 999;
	}
	for(z= location;z < list.length-1;z++)
    	{
    		temp[z] = list[z+1];
    	}	
	list = temp;
	}

	
	
	public void addInOrder(int newVal)
	{

	selectionSort();
	int location = 0;
	int x = 0;
	increaseSize();
	
	
	    while(x< list.length)
	    {
	    
	   		if(list[x] < newVal)
	   		 {
	   		 	
	   		 	if(x == list.length -1)
	   		 	{
	   		 	
	   		 		location = x;
	   		 	}
	   		 	
	   		 	else
	   		 	{
	   		 	x++;
	   		 	}
	   		 
	   		 }
	   		 
	   		 
	   		 
	   		 
	   		 if(list[x] > newVal)
	   		 {	 	
	   		 	location = x;
	   	 	 }
	   	
	   	if(location != 0)
	   	{
	   		x=999;
	   	}
	   	
	   	
	   	if(list[x] == list[list.length - (list.length-1)])
	   	{
	   		location = 0;
	   	}
	   	
	    }
	    	 GetInfo.showMessage(""+location);	
	    //location is one above where it needs to be
	    
	    
	    
	    if(location == list.length)
	    {
	    	list[(location - 1)] = newVal;
	    }
	    
	    else
	    {
	    for(x =list.length-1; x>location;x--)
	    {
	    	
	    	list[x] = list[x-1]; 
	    	print();
	    }
	    list[location] = newVal;
	    }
	    print();
	    
	}



}