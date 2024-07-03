import java.util.Scanner;
import java.util.Random;
public class RandomNos
{
	public static void main(String args[])
	{
		int a,n1,n2,nmax,nmin;
		
		n1 = (int)(Math.random()*10);
		n2 = (int)(Math.random()*10);
		Random rand = new Random();
		nmax = Math.max(n1,n2);
		nmin = Math.min(n1,n2);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Answer the question: " +nmax+ "-" +nmin);
		
		
		a = s.nextInt();
		
		if (a==nmax-nmin)
		{
			System.out.println("correct!");
		}
		else 
		{
			System.out.println("wrong!");
		}
		
	}
}