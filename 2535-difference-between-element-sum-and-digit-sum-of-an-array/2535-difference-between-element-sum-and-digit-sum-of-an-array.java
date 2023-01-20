class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        int digitSum =0;
        for(int i = 0; i< nums.length ; i++){
            sum+=nums[i];
            int num1 = nums[i];
            while(num1 > 0){
                digitSum+=num1%10;
                num1/=10;
            }
        }
        return Math.abs(sum-digitSum);
        // int length=nums.length;
        // int count=0;
        // for(int i=0;i<length;i++){
        //     count=count+nums[i];
        // }
        // int totalsum=count;
        // int indexcount=0;
        // for(int i=0;i<length;i++){
        //     int rem=nums[i]%10;
        //   indexcount+=rem;
        //     rem=rem/10;
        // }
        // return Math.abs(totalsum-indexcount);
    }
}