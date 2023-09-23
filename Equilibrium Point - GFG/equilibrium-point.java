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
        if(n==1){
            return 1;
        }
        long sum=0;
        for(long x:A){
            sum=sum+x;
        }
        long sum1=A[0];
        sum=sum-A[0];
        for(int i=1;i<n;i++){
            sum=sum-A[i];
            if(sum==sum1){
                return i+1;
            }
            sum1=sum1+A[i];
        }
        return -1;
    }
}

