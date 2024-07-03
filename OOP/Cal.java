import java.util.Scanner;
//import java.util.Math;
public class Cal
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.print("enter the degree : ");
	double d = s.nextDouble();
	//System.out.print("degree in radian " + Math.toRadians(d));
	double r = Math.toRadians(d);
	//using sine function normal
	System.out.println("value of sine function using trigo : " + Math.sin(r));
	//using sine formula
	System.out.print("value of sine function using formula : ");
	sine(r);
}
public static void sine(double a){
	double sin = 0;
	long n=10;
	//int fact =1;
	for (int i=0; i<=n;i++){
		int fact=1;
		for(int j=2;j<=2*i+1;j++){
			fact= fact*j;
		}
		sin += Math.pow( -1 ,i)*Math.pow(a,2*i+1)/(fact);
		//System.out.println(sin);
	}
	System.out.print((sin));
}
}
