/*
	Practice01MathRecursive.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: January 30, 2020
*/


public class Practice01MathRecursive implements Practice01Math
{
	public int fact (int n) throws Exception  
	{
		if (n<0)
		{
			throw new Exception("Negative Number\n");  //what to do when input is negative
		}
                                                 
		if (n<=1)       //base case 
		{
			return n;   //0! is always 0 and 1! is always 1
		}

		return (n * fact(n-1));  //method to progress towards the base case
			
	}

	public int fib (int n) throws Exception 
	{
		if (n<0)
		{
			throw new Exception("Negative Number\n");  //exception thrown when input is negative
		}

		if (n<2)       //base case
		{
			return n;  //first and second values of the fibonacci sequence are always the same 
		}

		return fib(n-1) + fib(n-2);  //how the program progresses to the base case
	}
}