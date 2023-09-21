//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


// class Solution
// {
//     //Function to find the maximum money the thief can get.
//     public int FindMaxSum(int arr[], int n)
//     {
//         // Your code here
//         int zero=0;
//         int first=0;
//         for(int i=0;i<arr.length;){
//             zero=zero+arr[i];
//             i=i+2;
//         }
//         for(int i=1;i<arr.length;i++){
//             first=first+arr[i];
//             i=i+2;
//         }
//         return Math.max(zero,first);
//     }
// }
class Solution {
    // Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n) {
        int evenSum = 0; // Sum of money when starting from the first house
        int oddSum = 0;  // Sum of money when starting from the second house

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
                evenSum = Math.max(evenSum, oddSum);
            } else {
                oddSum += arr[i];
                oddSum = Math.max(evenSum, oddSum);
            }
        }

        // Return the maximum of the two sums
        return Math.max(evenSum, oddSum);
    }
}

