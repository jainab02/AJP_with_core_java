import java.util.Scanner;
public class Vowel
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = s.next().charAt(0);
		boolean state = vowel(c);
		if(state){
			System.out.println("It is a vowel");
	}
	else{
		System.out.println("It is a consonent");
	}
}
public static boolean vowel(char c){		
		if(c=='a' || c =='A' || c== 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c== 'O' || c=='u' || c =='U')
			return true;
			//System.out.println(+c+" is a vowel");
		else
			return false;
			//System.out.println(+c+ " is a consonent ");
		
	}

}	