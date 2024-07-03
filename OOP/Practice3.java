import java.util.Scanner;
public class Practice3{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int milli;
		milli = s.nextInt();
		covert(milli);
	}
	public static void covert(int milli){
		int sec = (int)(milli /1000 ) % 60;
		int min = (int)((milli /(1000*60))) % 60;
		int hours = (int)((milli /(1000*60*60))) % 24;
		System.out.println( hours + ":" + min + ":" + sec);
		return;
	}
}

		
		