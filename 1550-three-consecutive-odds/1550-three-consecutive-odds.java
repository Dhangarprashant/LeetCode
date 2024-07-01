class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            int prev=arr[i-1];
            int curr=arr[i];
            int next=arr[i+1];
            if(prev%2==1 && curr%2==1 && next%2==1){
                return true;
            }
        }
        return false;
    }
}