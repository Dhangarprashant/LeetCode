class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }else{
                
            }
        }
        int idx=0;
        for(int i=0;i<nums.length;){
            if(nums[i]>0){
                nums[idx]=nums[i];
                idx++;
                i++;
            }else{
                i++;
            }
        }
        while(idx<nums.length){
            nums[idx]=0;
            idx++;
        }
        return nums;
    }
}