// ****************************************************************

// WriteTest.java

//

// A driver program that uses TestQuestion, Essay, MultChoice and

// GetInfo.  Will format and print test questions

//         

// ****************************************************************

 
import java.util.ArrayList;
 

public class WriteTest

{

    public static void main(String[] args)

    {

               String [] TestType = {"e", "m"};

               int TestSize = GetInfo.getSlider("Enter how many questions on the test: ",1,10);

               int nbrOfLines = 0; 
               	
               TestQuestion []  myTest = new TestQuestion [TestSize];

//  Loop to process all the date should go here

for(int i =0;i<TestSize;i++)
{



               //  Use GetInfo to read in the question Type

                
               //  NOTE:  In class TestQuestion – The question is read in when you

               //  make a super call from the child     

               //  Process all Essay Questions – instantiate and store objects in the array myTest
             
               String[] options1 =new String[2];
               
                options1[0] = "Essay"; 
               	options1[1] = "Multiple Choice";
		 	 
		 	 int choice1 = GetInfo.getOption("Would you like an essay or multiple choice question?",options1);
		 	 
		
               if (choice1 == 0)
               {
               	
               	int lines;
               	
               	lines = GetInfo.getInt("Please enter the amount of lines you want to print");
               	
               	Essay temp = new Essay(lines);
               	
               	myTest[i] = temp;
               	
               }
               
               if (choice1 == 1)
               {
               
               int choices = GetInfo.getSlider("Enter how many choices in the question: ",1,4);
               //int choices = GetInfo.getInt("Please enter the number of choices");
               
               MultipleChoice temp = new MultipleChoice(choices);
               
             
               String[] options =new String[2];
               
                options[0] = "Vertical"; 
               	options[1] = "Horizontal";
		 	 
		 	 int choice = GetInfo.getOption("Would you like to print vertically or horizontally?",options);
		 	 
		 	 if (choice == 0)
		 	 {
		 	   	temp.verifyPos(0);
		 	 }
		 	 if (choice == 1)
		 	 {
		 	   temp.verifyPos(1);
		 	 }
               
               
			   myTest[i] = temp;   
			   	 

               }
               
               
               	myTest[i].tostring();
               	
		}


//  Loop to getQuestionFromArray( ) all the questions in the array myTest[ ]





}

}