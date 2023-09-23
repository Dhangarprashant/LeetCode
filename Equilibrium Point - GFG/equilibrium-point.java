//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


// class Solution {

    
//     // a: input array
//     // n: size of array
//     // Function to find equilibrium point in the array.
//     public static int equilibriumPoint(long arr[], int n) {

//         // Your code here
//         int left=0;
//         int right=arr.length-1;
//         int leftsum=0;
//         int rightsum=0;
//         while(left<=right){
//             leftsum=leftsum+arr[left];
//             rightsum=rightsum+arr[right];
//             if(leftsum==rightsum){
//                 return left;
//             }
//             left++;
//             right--;
//         }
//     }
// }

// class Solution {
//     public static int equilibriumPoint(long A[], int n) {
//         int lefts=0;
//         int rights=0;
//         int left[]=new int[n];
//         int right[]=new int[n];
//         for(int i=0;i<n;i++){
//             lefts=lefts+A[i];
//             left[i]=lefts;
//         }
//         for(int i=n-1;i>=0;i--){
//             rights=rights+A[i];
//             right[i]=rights;
//         }
//         int ans=-1;
//         for(int j=0;j<n;j++){
//             if(left[j]==right[j]){
//                 ans=j+1;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public static int equilibriumPoint(long A[], int n) {
        long lefts = 0;
        long rights = 0;
        long left[] = new long[n];
        long right[] = new long[n];

        // Calculate the cumulative sum from the left
        for (int i = 0; i < n; i++) {
            lefts += A[i];
            left[i] = lefts;
        }

        // Calculate the cumulative sum from the right
        for (int i = n - 1; i >= 0; i--) {
            rights += A[i];
            right[i] = rights;
        }

        int ans = -1;
        for (int j = 0; j < n; j++) {
            // Check if the current element is an equilibrium point
            if (left[j] == right[j]) {
                ans = j + 1;
                break;
            }
        }

        return ans;
    }
}

