//check vowel or consonent by method
import java.util.Scanner;
public class Character{
	//method defination
	public static void  vowel(char ch){
		//checking the condition
		if (ch =='a' ||ch =='e' || ch =='i' || ch == 'o' || ch=='u' || ch =='A' ||ch =='E' || ch =='I' || ch == 'O' || ch=='U' ){
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
	//take user input
	System.out.println("enter the letter ");
	char ch = s.next().charAt(0);
	//method call
	vowel(ch);
}
}
