package java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintWriter pwt1 = new PrintWriter(new File("bubblein.txt"));
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            pwt1.println(rand.nextInt(10000) + 1);
        }
        pwt1.close();

    ArrayList<Integer> arr = new ArrayList<>();
    Scanner scan = new Scanner("bubblein.txt");
    String str[] = scan.nextLine().split(" ");


    for(int j = 0;j<100;j++)
    {
        arr.add(Integer.parseInt(str[j]));
        Collections.sort(arr, new BubbleSort());
    }
    PrintWriter pwt2 = new PrintWriter(new File("bubbleout.txt"));
    for(int k = 0;k<100;k++)
    {
        pwt2.println(arr.get(k));
    }
    pwt2.close();
    scan.close();
}
}

class BubbleSort {
    public void compare(Integer n1,Integer n2){
        int temp = n1;
        n1=n2;
        n2 = temp;
        //return n1,n2;
	}
}