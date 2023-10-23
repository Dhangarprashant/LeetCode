//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int a[], int n)  
	{  
	    //code here.
	    int miss[]=new int[n];
	    miss[0]=a[0];
	    int res=miss[0];
	    for(int i=1;i<n;i++){
	        miss[i]=a[i];
	        for(int j=0;j<i;j++){
	            if(a[j]<a[i] && miss[i]<miss[j]+a[i]){
	                miss[i]=miss[j]+a[i];
	            }
	        }
	        res=Math.max(res,miss[i]);
	    }
	    return res;
	}  
}