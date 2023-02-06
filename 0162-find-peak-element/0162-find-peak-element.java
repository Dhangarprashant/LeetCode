class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int n=nums.length;
        int nums2[]=nums.clone();
       // nums2[0]++;
        Arrays.sort(nums2);
        int m=nums2.length;
        int maxe=nums2[m-1];
        for(int i=0;i<n;i++){
            if(nums[i]==maxe){
                return i;
            }
        }
        return 0;
    }
}