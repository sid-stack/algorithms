
/**
 * LinearSearch
 * @author Siddhant
 * @version 1.0
 */
import java.util.*;
public class LinearSearch 
{
    public static int search(int arr[], int x) 
    { 
        for(int i = 0; i < arr.length; i++) 
        { 
            if(x == arr[i]) 
                return i; 
        } 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of entries:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[]= new int[n];
        for (int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched.");
        int x = sc.nextInt();
        int result = search(arr, x); 
        if(result == -1) 
            System.out.print("Element is not present in the array"); 
        else
            System.out.print("Element is present at position: " + (result+1)); 
    } 
    }
