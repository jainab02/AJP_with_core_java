import java.util.Scanner;
public class Practice1{
	static void  vowel(char ch){
		if (ch =='a' ||ch =='e' || ch =='i' || ch == 'o' || ch=='u' ){
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
	
public static void main(String[]args)
{
	Scanner s = new Scanner(System.in);
	char ch = s.next().charAt(0);
	vowel(ch);
}
}