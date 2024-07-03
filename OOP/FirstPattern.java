import java.util.Scanner;
public class FirstPattern
{
	public static void main(String[]args)
	{
		//declaring variable
		int i,j,n;
		//creatimg Scanner object
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of times you want to print the pattern: ");
		//scan the n variable
		n = s.nextInt();
		System.out.println("the pattern is : ");
		//printing Pattern
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
