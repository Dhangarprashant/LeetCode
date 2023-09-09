//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     static int majorityElement(int nums[], int size)
//     {
//         int val=nums[0];
//         int count=0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==val){
//                 count++;
//             }else if(count==0){
//                 val=nums[i];
//                 count=1;
//             }else{
//                 count--;
//             }
//         }
//         count=0;
//         for(int i=0;i<size;i++){
//             if(nums[i]==val){
//                 count++;
//             }
//         }
//         if(count>0){
//             return val;
//         }else{
//             return -1;
//         }
//     }
// }


class Solution {
    static int majorityElement(int nums[], int size) {
        int val = nums[0];
        int count = 1; // Initialize count to 1 for the first element

        for (int i = 1; i < size; i++) {
            if (nums[i] == val) {
                count++;
            } else if (count == 0) {
                val = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        // Verify if the val is a majority element
        count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                count++;
            }
        }

        if (count > size / 2) {
            return val;
        } else {
            return -1;
        }
    }
}
