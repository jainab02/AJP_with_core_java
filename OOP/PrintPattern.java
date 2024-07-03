import java.util.Scanner;
public class PrintPattern{
      public static void main(String args []){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter your number:");
		  int num = sc.nextInt();
		  
		  for(int i = 1; i<=num; i++){
			  for(int j = num - i;j>1; j--)
			  {
				 
				  System.out.print(" ");
				  for(j=1; j<=i; j++)
				  {
					  System.out.println("*");
				  }
				  System.out.println();
			  }
		  }
		  
		  
		  
	  }


   }