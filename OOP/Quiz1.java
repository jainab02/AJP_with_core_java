//generating quiz for user
import java.util.Scanner;
import java.util.Random;
public class Quiz1
{
	public static void main(String[]args)
	{
		//scan the variables
		Scanner s = new Scanner(System.in);
		int n1 , n2,n3,n4,n5,n6,n7,n8,add,sub,multiply,div;
		double ansadd,anssub,ansmul,ansdiv,correct;
		correct = 0;
		//generating random no
		n1 = (int)(Math.random()*100) ;
		n2 = (int)(Math.random()*100) ;
		n3 = (int)(Math.random()*100) ;
		n4 = (int)(Math.random()*100) ;
		n5 = (int)(Math.random()*100) ;
		n6 = (int)(Math.random()*100) ;
		n7 = (int)(Math.random()*100) ;
		n8 = (int)(Math.random()*100) ;
		n9 = (int)(Math.random()*100) ;
		n10 = (int)(Math.random()*100) ;
		//declare addition,substraction,multiply,division
		add = n1 +n2;
		sub = n3 - n4;
		multiply = n5*n6;
		div = n7/n8;
		
		//ask the question and check whether it is correct or not
		
		//ans for summation 
		System.out.print("Answer the following question " +n1+ " + " +n2+ "= ");
		ansadd = s.nextDouble();
		if (ansadd == n1+n2)
		{
			System.out.println("correct");
			correct++;
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//ans for substraction
		System.out.print("Answer the following question "+n3+ " - " +n4+ "= ");
		anssub = s.nextDouble();
		if (anssub == n3-n4)
		{
			System.out.println("correct");
			correct++;
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//ans for multiply
		System.out.print("Answer the following question "+n5+ " * " +n6+ "= ");
		ansmul = s.nextDouble();
		if (ansmul == n5*n6)
		{
			System.out.println("correct");
			correct++;
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//ans for division
		System.out.print("Answer the following question "+n7+ " / " +n8+ "= ");
		ansdiv = s.nextDouble();
		if (ansdiv == n7/n8)
		{
			System.out.println("correct");
			correct++;
		}
		else
		{
			System.out.println("Wrong");
		}
		System.out.println("you got " +correct+ " correct answers ");
	}
}
		