class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double median=0;
        int length=nums1.length+nums2.length;
        int ans[]=new int[length];
        int pos=0;
        for(int i:nums1){
            ans[pos]=i;
            pos++;
        }
        for(int i:nums2){
            ans[pos]=i;
            pos++;
        }
        Arrays.sort(ans);
        if(ans.length%2==1){
            median=ans[ans.length/2];
            return median;
        }else{
            median = (double)(ans[length/2]+ans[length/2-1])/2;
            return median;
        }
    }
}




