class Solution {
    public int getWinner(int[] arr, int k) {
        int ans=arr[0];
        int cons=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
                cons=0;
            }
            cons++;
            if(cons==k){
                break;
            }
        }
        return ans;
    }
}