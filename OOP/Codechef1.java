/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    for (int i=1;i<=t;i++){
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int z = Math.abs(x-y);
	        System.out.println(z);
	    }
		// your code goes here
	}
}
