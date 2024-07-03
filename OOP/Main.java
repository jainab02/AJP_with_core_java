package java;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
// import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintWriter pw1 = new PrintWriter(new File("input.txt"));
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            pw1.println(rand.nextInt(1000) + 1);
        }
        pw1.close();
        // s.close();
        int arr[] = new int[10000];
        Scanner scan = new Scanner(new File("input.txt"));
        String str[] = scan.nextLine().split(",");
        for (int i = 0; i < 50; i++) {
            arr[i] = Integer.parseInt(str[i]);

        }
        System.out.println("Enter the name of sorting \n");
        System.out.println("1.Bubble sort \n");
        System.out.println("2.Selection Sort");
        System.out.println("3.Insertion Sort");
        int x = scan.nextInt();
        switch (x) {
            case 1:
                BubbleSort ob = new BubbleSort();
                ob.bubbleSort(arr);
                System.out.println("array sorted by bubble sort");
                break;
            case 2:
                SelectionSort ob1 = new SelectionSort();
                ob1.selectionSort(arr);
                System.out.println("array sorted by selection sort");
            case 3:
                InsertionSort ob2 = new InsertionSort();
                ob2.insertionSort(arr);
                System.out.println("array sorted by insertion sort");
            default:
                break;
        }
        PrintWriter pw2 = new PrintWriter(new File("Output.txt"));
        for (int i = 0; i < 50; i++) {
            pw2.println(arr[i] + " ");
        }
        pw2.close();
        s.close();

    }
}
// package java;

class InsertionSort {
    public  void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {  
            int key = arr[i];  
            int j = i-1;  
            while ( (j >=0) && ( arr [j] > key ) ) {  
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
        } 
         //printing array
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + "\n") ;
    }

    }
    
}

// package java;

class SelectionSort {
    public  void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int key = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[key]){  
                    key = j;//searching for lowest index  
                }  
            }  
            //swap with smallest one
            int smallerNumber = arr[key];   
            arr[key] = arr[i];  
            arr[i] = smallerNumber;  
        } 
         //printing array
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + "\n") ;
    }

    }
    
}
// package java;

class BubbleSort {
    public  void bubbleSort(int arr[]){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j<arr.length-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        //printing array
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + "\n") ;
    }
    }

}
