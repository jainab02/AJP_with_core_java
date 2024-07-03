//program to find the grade
import java.util.Scanner;
public class Grade
{
	public static void main(String[]args)
	{
		//scan variable
		double P;
		Scanner s = new Scanner(System.in);
		//print percentage
		System.out.println("enter your percentage : " );
		P = s.nextDouble();
		String Grade = "";
		//check condition and print result
		
		if(P>=85 && P<=100)//
		{
			Grade = "AA";
		}
		else if (P>=75 && P<= 84)
		{
			Grade = "AB";
		}
		else if (P>=65 && P<=74)
		{
			Grade="BB";
		}
		else if (P>=55 && P<=64)
		{
			Grade="BC";
		}
		else if (P>=45 && P<=54)
		{
			Grade="CC";
		}
		else if (P>=40 && P<=44)
		{
			Grade="CD";
		}
		else if (P>=35 && P<=39)
		{
			Grade="DD";
		}
		else if (P>100 || P<0)
		{
			Grade ="invalid input";
		}
		else
		{
			Grade = "FF";
		}
		System.out.println("Result is : "+Grade);
	}
}

		
		
		
		