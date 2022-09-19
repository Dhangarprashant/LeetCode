class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double median=0;
        int length=nums1.length+nums2.length;
        int ans[]=new int[length];
        int pos=0;
        for(int element:nums1){
            ans[pos]=element;
            pos++;
        }
        for(int element:nums2){
            ans[pos]=element;
            pos++;
        }
        int l=ans.length;
        Arrays.sort(ans);
        if(l%2==1){
            median=ans[l/2];
            return median;
        }else
             median=(double)(ans[l/2]+ans[l/2-1])/2;
        return median;
    }
}