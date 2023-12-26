class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double avg=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        avg=sum*1.0/k;
        ans=avg;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            avg=sum*1.0/k;
            ans=Math.max(ans,avg);
        }
        return ans;
    }
}