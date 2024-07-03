import java.util.Scanner;
public class ReverseNo{
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		System.out.print("enter the no: ");
		int[] n = new int[10];
		for (int i=0;i<n.length;i++){
			n[i] = s.nextInt();
		}
		//System.out.print("reverse of no is : ");
		reverse(n);
		System.out.print("reverse of no is : ");
		for (int i : n){
			System.out.print(i + " ");
		}
		
	}
	public static void reverse(int a[] ){
		int temp;
		for (int i = 0, j= a.length - 1; i < a.length / 2; i++, j--){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}

			