//NEW ORIGINALS 
// **** LAB6POINT1E  DRIVER  *************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************
public class IntegerListTest{

	static IntegerList list = new IntegerList(10);
	static String detail_Line = new String();  
    static String[] Choices = new String[9];

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {

		createMenu();

		int choice = GetInfo.getList("Enter your choice", Choices);

		while (choice != 0)
	    {
			dispatch(choice);
		; 
			choice = GetInfo.getList("Enter your choice", Choices);
			
	    }
    }


    //-------------------------------------------------------
    // Do what the menu item calls for
    //-------------------------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	switch(choice)
	    {
	    case 0: 
		GetInfo.showMessage("Bye!");
		break;
		
	    case 1:
		int size = GetInfo.getSlider("How big should the list be?",1,25);
		list = new IntegerList(size);
		list.randomize();
		list.selectionSort();
		break;
		
	    case 2:
		list.selectionSort();
		break;
		
	    case 3:
		loc = list.search(GetInfo.getSlider("Enter the value to look for: ",1,100));
		if (loc != -1)
		    GetInfo.showMessage("Found at location " + loc);
		else
		    GetInfo.showMessage("Not in list");
		break;
	    
	    case 4:
	    	int Val =0;
	    	int idiot = 1;
	    	while(idiot == 1)
	    	{
	    		Val = GetInfo.getInt("Please enter your new value");
	    	if(Val>100)
	    	{
	    		GetInfo.showMessage("You must eneter a value between 1 and 100");
	    	}
	    	else
	    	{
	    		idiot = 0;
	    	}
	    	
	    	} 
	    	
	    	list.addElement(Val);
	    	break;
	    	 
	    case 5:
	 
	    	int Val2=0;
	    	
	    	idiot = 1;
	    	while(idiot == 1)
	    	{
	    	Val2 = GetInfo.getInt("Enter the value you would like to remove");
	    	if(Val2>100)
	    	{
	    		GetInfo.showMessage("You must eneter a value between 1 and 100");
	    	}
	    	else
	    	{
	    		idiot = 0;
	    	}
	    	
	    	} 
	    	list.removeFirst(Val2);
	    break;
	   
	   case 6:
	    	int yy=0;
	    	idiot = 1;
	    	while(idiot == 1)
	    	{
	    	yy = GetInfo.getInt("Enter the value you would like to remove");
	    	if(yy>100)
	    	{
	    		GetInfo.showMessage("You must eneter a value between 1 and 100");
	    	}
	    	else
	    	{
	    		idiot = 0;
	    	}
	    	
	    	} 
	    	
	    	list.removeAll(yy);
	     break;
	    
	     case 7:
	    	int yz=0;
	    	
	    	idiot = 1;
	    	while(idiot == 1)
	    	{
	    	yz = GetInfo.getInt("Enter the value you would like to add");
	    	if(yz>100)
	    	{
	    		GetInfo.showMessage("You must eneter a value between 1 and 100");
	    	}
	    	else
	    	{
	    		idiot = 0;
	    	}
	    	
	    	} 
	    	list.addInOrder(yz);
	    break;
	    
	    case 8:
//		GetInfo.showMessage(" \n");
		list.print();
		break;
		
	    default:
		GetInfo.showMessage("Sorry, invalid choice");
	
	 
	    }
    }


    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
    public static void createMenu()
    {

		Choices[0] = "0: Quit";
		Choices[1] = "1: Create a new list (** do this first!! **)";
		Choices[2] = "2: Sort the list using selection sort";
		Choices[3] = "3: Find an element in the list using sequential search";
		Choices[4] = "4: Add a value to the list";
		Choices[5] = "5: Remove the first instance of a number";
		Choices[6] = "6: Remove all instances of a number";
		Choices[7] = "7: Add a value and insert it ordered from least to greatest";
		Choices[8] = "8: Print the list";
		
		
		
		

    }


}

 
