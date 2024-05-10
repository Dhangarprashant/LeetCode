class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n=arr.length;
        double low=arr[0]/(double)arr[n-1];
        double high=1;
        while(low<high){
            double mid=(low+high)/2;
            int count[]=helper(arr,mid);
            if(k<count[0]){
                high=mid;
            }else if(k>count[0]){
                low=mid;
            }else{
                return new int[]{count[1],count[2]};
            }
        }
        return null;
    }
    public static int[] helper(int arr[],double target){
        int count=0;
        int i=0;
        int num=arr[0];
        int deno=arr[arr.length-1];
        for(int j=1;j<arr.length;j++){
            while(arr[i]<=arr[j]*target){
                i++;
            }
            count+=i;
            if(i>0 && arr[i-1]*deno>arr[j]*num){
                num=arr[i-1];
                deno=arr[j];
            }
        }
        return new int[]{count,num,deno};
    }
}