// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list.
//          
// ****************************************************************
//import IntList;

public class ListTest
{
    public static void main(String[] args)
    {
	IntList myList = new IntList(4);
	myList.add(100);
	myList.add(50);
	myList.add(200);
	myList.add(25);
	System.out.println(myList.toString());
	
	SortedIntList myList1 = new SortedIntList(4);
	myList1.add(100);
	myList1.add(50);
	myList1.add(200);
	myList1.add(25);
	System.out.println(myList1.toString());
	
	
	
    }
}
