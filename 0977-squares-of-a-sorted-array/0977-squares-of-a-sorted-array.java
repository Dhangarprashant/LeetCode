class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int result[]=new int[nums.length];
        while(left<=right){
            int val1=nums[left]*nums[left];
            int val2=nums[right]*nums[right];
            if(val1>val2){
                result[index]=val1;
                left++;
                index--;
            }else{
                result[index]=val2;
                right--;
                index--;
            }
        }
        return result;
    }
}
