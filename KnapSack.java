/**
 * KnapSack Recursion
 * @author Sid
 * @version 1.0
**/
import java.util.*;
public class KnapSack 
{   
      public static void main(String args[])
    {
        // Integer w[] = {1,2,4,2,5};
        // Integer v[] = {5,3,5,3,2};
        // int c = 10;
        // int max = Collections.max(Arrays.asList(v));
        // String t = "This is Java";
        // String res[] = t.split(" ");
        // for(String i : res)
        // System.out.println(i);
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter no.");
            n = sc.nextInt();
            if(n==-1) break;
            System.out.println(fib(n));
        }
        while(true);
    }

    static long fib(int n)
    {
        // int fib_arr[] = new int[n+2];
        long fib_arr[] = new long[n+2];
        fib_arr[0] = 0;
        fib_arr[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            fib_arr[i] = fib_arr[i-1] + fib_arr[i-2];
        }
        return fib_arr[n];
    }
    // public static int knapsack(int w[], int v[], int c)
    // {
    //for(int i = 0; i<w.length; i++)

    // }
}