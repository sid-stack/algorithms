import java.util.*;
public class OBST  
{ 
    // A recursive function to calculate cost of 
    // optimal binary search tree 
    static int optCost(int freq[], int i, int j) 
    { 
        // Base cases 
        if (j < i)      // no elements in this subarray 
            return 0; 
        if (j == i)     // one element in this subarray 
            return freq[i]; 

        // Get sum of freq[i], freq[i+1], ... freq[j] 
        int fsum = sum(freq, i, j); 

        // Initialize minimum value 
        int min = Integer.MAX_VALUE; 

        // One by one consider all elements as root and  
        // recursively find cost of the BST, compare the  
        // cost with min and update min if needed 
        for (int r = i; r <= j; ++r) 
        { 
            int cost = optCost(freq, i, r-1) +  
                optCost(freq, r+1, j); 
            if (cost < min) 
                min = cost; 
        } 

        // Return minimum value 
        return fsum + min; 
    } 

    static void optSearch(int keys[], int freq[], int key)
    {
        for(int i = 0; i<keys.length; i++)
        {
            if(key==keys[i])
            {
                System.out.print("Node: "+(i+1)+" Successful "+"\tFrequency = "+freq[i]);
                int level = (int)(Math.log(i)/Math.log(2));
                System.out.println("\tCost to Search key: "+(freq[i]*level));
                break;
            }
            else
            {
                System.out.println("Node: "+(i+1)+" Unsuccessful");
            }
        }   
    }

    static int optimalSearchTree(int keys[], int freq[], int n) 
    { 
        // Here array keys[] is assumed to be sorted in  
        // increasing order. If keys[] is not sorted, then 
        // add code to sort keys, and rearrange freq[]  
        // accordingly. 
        return optCost(freq, 0, n-1); 
    } 

    // A utility function to get sum of array elements  
    // freq[i] to freq[j] 
    static int sum(int freq[], int i, int j) 
    { 
        int s = 0; 
        for (int k = i; k <=j; k++) 
            s += freq[k]; 
        return s; 
    } 

    // Driver code 
    public static void main(String[] args) { 
        int keys[] = {10, 12, 20, 30 ,45, 40}; 
        int freq[] = {34, 8, 50, 6, 17, 63}; 
        int n = keys.length; 
        System.out.println("Cost of Optimal BST is " + 
            optimalSearchTree(keys, freq, n)); 
        System.out.println("Key to Search:");
        Scanner sc = new Scanner(System.in);
        int key = sc .nextInt();
        optSearch(keys, freq, key);
    } 
} 