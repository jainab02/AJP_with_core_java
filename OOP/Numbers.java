import java.util.Scanner;
public class Numbers
{	public static void main(String[]args)
	{
		int n1,n2,n3,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no :");
		n1 = s.nextInt();
		System.out.println("enter second no :");
		n2 = s.nextInt();
		if (n1<n2)
		{
			temp = n1;
			n1=n2;//100=101
			n2 = temp;//101=100
		}
		System.out.println("enter third no :");
		n3 = s.nextInt();
		if (n2<n3)
		{
			if (n1<n3)
			{
				temp=n3;
				n3=n1;
				//n3=n2;//102=100//temp=n1;
				//n2=n1;//100=101//n3=n1;//101=102
				n1=temp;//102=101//102=
			}
			else
			{
				temp=n2;
				n2=n3;
				n3=temp;
			}
			
		}

		System.out.println("Decresing order is " +n1+ "," +n2+ " , "+n3);
	}
}

		