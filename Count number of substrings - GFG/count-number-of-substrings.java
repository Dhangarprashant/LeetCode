//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        return atMostKdigits(S,K)-atMostKdigits(S,K-1);
    }
    long atMostKdigits(String s,int k){
        if(k<0){
            return 0;
        }
        int i=0;
        int j=0;
        int count=0;
        long ans=0;
        int[] m=new int[26];
        while(j<s.length()){
            m[s.charAt(j)-'a']++;
            if(m[s.charAt(j)-'a']==1){
                count++;
            }
            while(count>k){
                m[s.charAt(i)-'a']--;
                if(m[s.charAt(i)-'a']==0){
                    count--;
                }
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}