import java.util.Scanner;
public class Pattern2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("enter n : ");
		int n = s.nextInt();
		for (int i=1;i<=n;i++){ //rows
			for (int j=1;j<=i;j++){ //column
			System.out.print(j);
			}
			System.out.println();
		}
	}
}