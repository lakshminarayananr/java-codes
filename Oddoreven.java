import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Addoreven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input%2 ==0)
		{System.out.println("Even");}
		else if(input%2 != 0)
		{System.out.println("Odd");}
	}
}
