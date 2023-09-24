//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends






 class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> duplicatesSet = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            if (!set.add(arr[i])) {
                duplicatesSet.add(arr[i]);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(duplicatesSet);
        
        if (result.isEmpty()) {
            // If no duplicates were found, add -1 to the list.
            result.add(-1);
        }
        
        return result;
    }
}


// import java.util.*;

// public class Solution {
//     public static ArrayList<Integer> duplicates(int arr[], int n) {
//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for (int i = 0; i < n; i++) {
//             if (set.contains(arr[i])) {
//                 list.add(arr[i]);
//             } else {
//                 set.add(arr[i]);
//             }
//         }
        
//         if (list.size() == 0) {
//             list.add(-1);
//         }
        
//         // Sort the list in ascending order
//         Collections.sort(list);
        
//         return list;
//     }
// }


// class Solution {
//     public static ArrayList<Integer> duplicates(int arr[], int n) {
//         ArrayList<Integer> list=new ArrayList<>();
//         int nums[]=new int[n];
//         for(int i=0;i<n;i++){
//             nums[arr[i]]+=1;
//         }
//         for(int i=0;i<n;i++){
//             if(nums[i]>1){
//                 list.add(i);
//             }
//         }
//         if(list.size()==0){
//             list.add(-1);
//         }
//         return list;
//     }
// }
