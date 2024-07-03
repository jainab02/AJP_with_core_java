
import java.util.Scanner;
public class GreatestNo
{
	public static void main(String[]args)
	{
		int n1,n2,n3;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no :");
		n1 = s.nextInt();
		System.out.println("enter second no :");
		n2 = s.nextInt();
		System.out.println("enter third no :");
		n3 = s.nextInt();
		
		if (n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(+n1+" is greatest ");
			}
			else
			{
				System.out.println(+n3+" is greatest");
			}
		}
		else
		{
			if(n2>n3)
		    {
			    System.out.println(+n2+ " is greatest");
	        }
			else
			{
				System.out.println(+n3+ " is greatest");
			}
		}
	}
}
