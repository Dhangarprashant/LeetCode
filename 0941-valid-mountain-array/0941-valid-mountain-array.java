class Solution 
{
    public boolean validMountainArray(int[] arr)
    {
        int n=arr.length;
        if(n<3){
            return false;
        }
        boolean inc=false;
        boolean dec=false;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                if(dec){
                    return false;
                }
                inc=true;
            }else if(arr[i]<arr[i-1]){
                if(!inc){
                    return false;
                }
                dec=true;
            }else{
                return false;
            }
        }
        return inc && dec;
    }
}