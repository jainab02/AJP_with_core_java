import java.util.Scanner;
class Amount
{
	public static void main(String args[])
	{
		double IA,IR,N;
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter investment amount : ");
		IA = s.nextDouble();
		System.out.print("enter annual interest rate : ");
		IR = s.nextDouble();
		System.out.print("enter no of years : ");
		N = s.nextDouble();
		
		double MIR = IA /1200;
		
		double Fir = IA * Math.pow(1 + MIR , N * 12);
		System.out.print("Future investment amount : " +Fir);
	}
}