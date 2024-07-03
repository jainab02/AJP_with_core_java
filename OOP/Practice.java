import java.util.Scanner;
public class Practice{
public static void factorial(int n){
	if (n<0)
	{
		System.out.println("invalid");
	}
	else{
	 
	int fact = 1;
	
	for (int i=n;i>=1;i--)
	{
		  fact= fact*i;
	}
	System.out.println(fact);
	
	}
}
		  
public static void main(String[]args)
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	factorial(n);
} 
}  