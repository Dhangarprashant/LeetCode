class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long prefix[]=new long[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        long result=Integer.MIN_VALUE;
        for(int i=2;i<nums.length;i++){
            if(nums[i]<prefix[i-1]){
                result=prefix[i];
            }
        }
        return result==Integer.MIN_VALUE?-1:result;
    }
}