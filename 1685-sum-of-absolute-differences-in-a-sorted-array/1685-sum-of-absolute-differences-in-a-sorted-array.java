// class Solution {
//     public int[] getSumAbsoluteDifferences(int[] nums) {
//         int ans[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=0;j<nums.length;j++){
//                 sum=sum+Math.abs(nums[i]-nums[j]);
//             }
//             ans[i]=sum;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int[] result = new int[n];
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the right sum
            int rightSum = totalSum - leftSum - nums[i];

            // Calculate the absolute differences
            result[i] = (i * nums[i] - leftSum) + (rightSum - (n - 1 - i) * nums[i]);

            // Update the leftSum for the next iteration
            leftSum += nums[i];
        }

        return result;
    }
}
