class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int index=n-1;
        int res[]=new int[n];
        while(start<=end){
            int val1=nums[start]*nums[start];
            int val2=nums[end]*nums[end];
            if(val1>val2){
                res[index]=val1;
                start++;
            }else{
                res[index]=val2;
                end--;
            }
            index--;
        }
        return res;
    }
}