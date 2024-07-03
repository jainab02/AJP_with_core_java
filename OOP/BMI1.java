//print BMI values
import java.util.Scanner;
public class BMI1
{
	public static void main(String[] args)
	{
		//declare variable
		int w,h;
		double W,H,BMI;
		Scanner s = new Scanner(System.in);
		
		//scan weight and height
		System.out.print("Enter the value for weight in pounds : ");
		w = s.nextInt();
		System.out.print("Enter the value for height in inches : ");
		h = s.nextInt();
		
		//convert height and weight
		W = w * 0.45359237;
		H = h * 0.0254;
		
		//calculate bmi
		BMI = (W) / (H*H) ;
		
		// print bmi
		System.out.println("bmi is : " +BMI);
		System.out.println("height in meters is " +H);
	    System.out.println("weight in kg is " +W);
		
		//check for the appropriate category
		//in this if statement if bmi value is less than 18.5 then underweight result will be printed
		if (BMI <18.5)
		{
			System.out.println("Underweight");
		}
		//in this code if bmi value is between 18.5 and 25 then normal will be printed
		else if (BMI >=18.5 && BMI <=25)
		{
			System.out.println("Normal");
		}
		//in this code if bmi value is between 25 and 30 then Overweight will be printed
		else if (BMI>=25 && BMI <=30.0)
		{
			System.out.println("Overweight");
		}
		//in this code if bmi value is greater than 30  then obessed will be printed
		else
		{
			System.out.println("Obessed");
		}
	}
}
