import java.util.Scanner;
public class BMI
{
	public static void main(String[] args)
	{
		int w,h;
		double W,H,BMI;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the value for weight in pounds : ");
		w = s.nextInt();
		System.out.print("Enter the value for height in inches : ");
		h = s.nextInt();
		W = w * 0.45359237;
		H = h * 0.0254;
		BMI = W / H*H ;
		System.out.println("bmi is : " +BMI);
		System.out.println("height in meters is " +H);
	    System.out.println("weight in kg is " +W);
	}
}
