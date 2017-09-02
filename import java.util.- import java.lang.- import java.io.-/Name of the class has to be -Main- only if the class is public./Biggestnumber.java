import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Biggestnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
	            int input2=sc.nextInt();
		int input3=sc.nextInt();
		if((input1>input2)&&(input1>input3))
		{System.out.println("biggest number is"+input1);}
		else if((input2>input1)&&(input2>input3))
		{System.out.println("biggest number is"+input2);}
		else
		{System.out.println("biggest number is"+input3);}
	}
}
