//*ORIGINAL*******************************************
//
// 		Fibonacci.java
//
//*******************************************************

public class Fibonacci
{

int temp = 0;
int temp2 = 1;
int sum1 = 1;
String sum = "\n ";
int sumtotal;

  //-----------------------------------------------------
  //	Print the first ten terms of Fibonacci Sequence
  //-----------------------------------------------------

  
  //First method using System.out
  /* public void Fibonacci(int fibCount)
  {
  	if(fibCount == 1)
  	{
  		System.out.println(sum);
  	}
  	else
  	{
  		
  		temp2 = sum;
  		System.out.println(sum);
  		sum = temp + sum;
  		temp = temp2;
  		fibCount = fibCount - 1;
  		Fibonacci(fibCount);
  	}  
  }
  */ 

//New version using GetInfo
public String Fibonacci(int fibCount)
  {
  	if(fibCount == 0)
  	{
  		return sum;
  	}
  	else
  	{
  		
  		temp2 = sum1;
  		sum = sum + (sum1 + ", ");
  		sum1 = temp + sum1;
  		temp = temp2;
  		fibCount = fibCount - 1;
  		Fibonacci(fibCount);
  		return sum;
  	}  
  }



}
