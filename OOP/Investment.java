//calculate future investment rate
import java.util.Scanner;
public class Investment
{
	public static void main(String[]args)
	{
		//declare variable
		double IA,AIR,N,FIA,MIR;
		
		//IA=investment amount
		//AIR  = annual investment rate
		//N = no of years
		//FIA = future investment rate
		//MIR = monthly investment rate
		
		//scan the variables
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value for Investment Amount ");
		IA = s.nextDouble();
		System.out.print("Enter the value for annual interest rate ");
		AIR = s.nextDouble();
		System.out.print("Enter the value for no of years ");
		N = s.nextDouble();

		//calculate monthly investment rate
		MIR = AIR/1200;
		System.out.println("monthly interest rate" +MIR);
		
		//calculate future investment amount
		FIA = IA* Math.pow(1+MIR,N*12);
		System.out.println("future investment rate " +FIA);
	
	}
}
		