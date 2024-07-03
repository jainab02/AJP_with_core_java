//converts millisec to hours,min, sec
import java.util.Scanner;
public class Hours{
	//defining main method 
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		long milli;
		//take input 
		System.out.println("enter the value for milliseconds : ");
		milli = s.nextInt();
		//method call
		covert(milli);
	}
	
	// method defining
	public static void covert(long milli){
		//conversion into hours sec and min
		long sec = (long)(milli /1000 ) % 60;
		long min = (long)((milli /(1000*60))) % 60;
		long hours = (long)((milli /(1000*60*60))) % 24;
		System.out.println( hours + ":" + min + ":" + sec);
		return;
	}
}

		
		