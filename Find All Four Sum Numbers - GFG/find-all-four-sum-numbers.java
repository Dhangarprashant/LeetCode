//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int S) {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==S){
                        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        if(!set.contains(list)){
                            ans.add(list);
                            set.add(list);
                        }
                        left++;
                        right--;
                    }else if(sum<S){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}


// class Solution {
//     public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
//         // code here
//         Arrays.sort(arr);
//         int n = arr.length;
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         // HashSet<ArrayList<Integer>> hs = new HashSet<>();
        
//         for(int i=0; i<n; i++){
//             if(i!=0 && arr[i]==arr[i-1]) continue;
//             for(int j=i+1; j<n; j++){
//                 if(j!=i+1 && arr[j]==arr[j-1]) continue;
//                 int s = j+1, e= n-1;
                
//                 while(s<e){
//                     int sum = arr[i]+arr[j]+arr[s]+arr[e];
//                     if(sum==k){
//                         ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[s],arr[e]));
//                         // if(!hs.contains(l)){
//                         //     list.add(l);
//                         //     hs.add(l);
//                         // }
//                         list.add(l);
//                         s++;e--;
//                         while(s<e && arr[s]==arr[s-1]) s++;
//                         while(s<e && arr[e]==arr[e+1]) e--;
//                     }
//                     else if(sum<k) s++;
//                     else e--;
//                 }
//             }
//         }
//         return list;
//     }
// }
