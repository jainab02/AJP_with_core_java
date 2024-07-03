 /*
Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s 
, display the matrix, check every row and column have an odd number’s of 1’s
*/
import java.util.Random;
public class Matrix{
	public static void main(String args[]){
		int [][] arr = new int [6][6];
		for (int i=0;i<6;i++){
			for (int j=0;j<6;j++){
				arr[i][j] = (int)(Math.random()*2);
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		//display result
		System.out.println("each row of a matrix has " + (rowodds(arr) ?"":"doesnot " + "have odd no of rows"));
		System.out.println("each column of a matrix has " + (columnodds(arr) ?"":"doesnot " + "have odd no of columns"));
	}
	public static boolean rowodds(int m[][]){
		int c=0;
		for (int i=0;i<m.length;i++){
			for (int j=0;j<m[i].length;j++){
				if(m[i][j] == 1){
					c++;
				}
			}
			if(c%2==0){
				return false;
			}
		}
		return true;
	}
	public static boolean columnodds(int m[][]){
		int c=0;
		for (int i=0;i<m.length;i++){
			for (int j=0;j<m[i].length;j++){
				if(m[i][j] == 1){
					c++;
				}
			}
			if(c%2==0){
				return false;
			}
		}
		return true;
	}
}
		
			

	