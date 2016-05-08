

public class SquareTest
{

	public static void main(String[] args)
		int count = 1;                           //count which square we're on


            System.out.println("Entering a 3 for the size, means you are creating a 3 x 3 array");
            int size = GetInfo.getInt("Enter the size of the array, or a  -1  to terminate the program");

            //Enter a  -1  to terminate the program

            while (size != -1)

                {


                        //create a new Square of the given size

 						int[][] square1 = new int[size][size]

                        //call its read method to read the values of the square

 						

                        System.out.println("\n******** Square " + count + " ********");

                        //print the square

 

                        //print the sums of its rows

 

                        //print the sums of its columns

 

                        //print the sum of the main diagonal

 

                        //print the sum of the other diagonal

 

                        //determine and print whether it is a magic square

 

                        //get size of next square

                        size = GetInfo.getInt("Enter the size of the array, or a  -1  to terminate the program");

                }

   }

}