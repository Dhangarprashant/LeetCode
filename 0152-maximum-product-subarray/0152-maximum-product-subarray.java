class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currentproduct=1;
            for(int j=i;j<nums.length;j++){
                currentproduct=currentproduct*nums[j];
                maxproduct=Math.max(maxproduct,currentproduct);
            }
        }
        return maxproduct;
    }
}