import java.util.Scanner;
public class Convert{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter milliseconds ");
		long milli = s.nextLong();
		System.out.println("time is :");
		convertmillis(milli);
	}
	public static void convertmillis(long m){
		long h = (long)(m/1000*60*60)%24;
		long sec = (long)(m/1000*60)%60;
		long min =  (long)(m/1000)%60;
		System.out.print(h + ":" + min +":" + sec);
		
	}
}