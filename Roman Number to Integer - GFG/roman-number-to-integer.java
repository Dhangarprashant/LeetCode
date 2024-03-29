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
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer>  map=new HashMap<>();
        int n=str.length();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                sum=sum-map.get(str.charAt(i));
            }else{
                sum=sum+map.get(str.charAt(i));
            }
        }
        sum=sum+map.get(str.charAt(n-1));
        return sum;
    }
}