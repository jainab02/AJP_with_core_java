import java.util.Scanner;
 
class Practice2 {
  public static void main(String[] args) {
 
    Scanner in = new Scanner(System.in);
    System.out.print("Enter value of n: ");
    int n = in.nextInt();
 
    for(int i=0; i<n; i++){
      for(int k=1; k<n-i; k++){
        System.out.print(" ");
      }
      for(int j=0; j<=i; j++){
        System.out.print(nCr(i,j)+" ");
      }
      System.out.println();
    }
    
  }
  //Function to return the value of nCr
  private static int nCr(int n, int r){
    if(n<r || n==0)
      return 1;
 
    int num = 1, den = 1;
    for(int i=r; i>=1; i--){
      num = num * n--;
      den = den * i;
    }
    return num/den;
  }
}