import java.util.Scanner;
public class Emirp {
	/** Main method */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 10 numbers:");
		int n = s.nextInt();
		int count =2;
		while(n>1){
			if (n%count==0){
				System.out.print(count +" ");
				n=n/count;
			}
			else{
				count++;
			}
		}
	}
}