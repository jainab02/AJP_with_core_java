//calculate sinee function using method
import java.util.Scanner;
public class SineFunction{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		//take user input
		System.out.println("enter the degree:");
		double d = s.nextDouble();
		double x = Math.toRadians(d);  //convert it into radian
		System.out.println("value of sine function : " + Math.sin(x));
		System.out.println("value of sine function using formula ");
		sine(x);           //call method
	}
	
	// define method
	
	public static void sine(double d){
		double sine=0;
		long n = 10;
		// for power of the series
		for (int i =0; i<=n;i++){
			int fact = 1;
			//loop for factorial
			for(int j =2 ; j<=2*i+1;j++){
				fact = fact*j;
			}
			sine+= Math.pow(-1,i)*Math.pow(d,2*i+1)/(fact);
			//System.out.println(sine);
		}
		//print result
		System.out.println((sine));
	}
}