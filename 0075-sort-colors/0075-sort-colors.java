class Solution {
    public void sortColors(int[] nums) {
        int s=nums.length;
        int k=0;
        int[] arr= new int[s];
        for(int i=0;i<s;i++){
            if(nums[i]==0)
            arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++){
            if(nums[i]==1)
            arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++){
            if(nums[i]==2)
            arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++)
        {
        nums[i]=arr[i];
        }
    }
}