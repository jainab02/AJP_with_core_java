//      1
//     1 1 
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1(
// */
import java.util.Scanner;
public class Pascal
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("enter rows : ");
		int n = s.nextInt();
		for (int i=0;i<=n;i++){
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;i++){
				System.out.println(nCr(i,k) + " ");
			}
			System.out.println();
		}
	}
	public static int nCr(int n , int r){
		if (n<r || n==0){
			return 1;
		}
		int result = fact(n)/(fact(r)*fact(n-r));
		return result;
		
	}
	public static int fact(int a){
		int f=1;
		for(int i=1;i<=a;i++){
			f=f*i;
		}
		return f;
	}
}