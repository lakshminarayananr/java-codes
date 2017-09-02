import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		 {if(year%100==0)
		   {if(year%400==0)
		             {System.out.println("Leapyear");}
		    else
		             {System.out.println("non  leap year");}
		   }
		  else
		        {System.out.println("non leap year");}
		 }
		 else
		         {System.out.println("non_leap year");}
	}
}
