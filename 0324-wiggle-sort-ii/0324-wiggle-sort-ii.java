class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans[]=new int[n];
        int left=1;
        int right=n-1;
        while(left<n){
            ans[left]=nums[right];
            left=left+2;
            right--;
        }
        left=0;
        while(left<n){
            ans[left]=nums[right];
            left=left+2;
            right--;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}