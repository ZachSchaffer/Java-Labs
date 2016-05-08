// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest  
{
    public static void main(String[] args)
    {

	
	Labrador Elise = new Labrador("Elise", "Black");
	Yorkshire Chrissy = new Yorkshire("Chrissy");
	
	
	System.out.println(Elise.getName() + " says " + Elise.speak());
	System.out.println(Chrissy.getName() + " says " + Chrissy.speak());
	
	System.out.println("The average breed weight for a Labrador is "+ Elise.avgBreedWeight()+ " pounds");
	System.out.println("The average breed weight for a Yorkshire is "+ Chrissy.avgBreedWeight()+ " pounds");
	 
    }
}
