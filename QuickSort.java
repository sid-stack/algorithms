/**
 * QuickSort
 * @author Sid
 * @version 1.0
 */
import java.util.*;
public class QuickSort {

   
    int partition(int arr[], int low, int high) //Dividing
    { 
        int pivot = arr[low];  
        int down = low;  
        int up = high;
        while(down<up)
        {
            while(arr[down]<=pivot && down<high)
                down++;
               
            while(arr[up]>pivot)
                up--;
            if(down<up)
            {
                int temp=arr[down];
                arr[down]=arr[up];
                arr[up]=temp;
            }
        }
        arr[low]=arr[up];
        arr[up]=pivot;
        return(up);
         
    } 
    void sort(int arr[], int low, int high) //Conquer
    { 
        if (low < high) 
        { 
            int pa = partition(arr, low, high);  
            sort(arr, low, pa-1); 
            sort(arr, pa+1, high); 
        } 
    } 
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[]= new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int n1 = arr.length;
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n1-1); 
  
        System.out.println("Sorted array: "); 
        printArray(arr); 
    } 
} 

