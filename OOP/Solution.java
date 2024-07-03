import java.util.Scanner;



public class Solution {
    public static void main(String[] args){
        int N,i,result;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        if (N>=2||N<=20) {
            for(i=1;i<=10;i++){
                result=N*i;
                System.out.println(N+ " * " +i+ " = " +result);
            }
            
        } else {
            System.out.println("invalid");
        }
    }
}
