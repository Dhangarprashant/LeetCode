// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int n=nums.length;
//         int count=0; 
//         for(int i=0;i<n;i++){
//             if(nums[i]==1){
//                 count++;
//             }
//         }
//         int count1=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 count1++;
//             }
//         }
//         return n-count1-2;
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int freq = 0, maxFreq = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                freq++;
            else {
                maxFreq = Math.max(maxFreq, freq);
                freq = 0;
            }
        }
        maxFreq = Math.max(maxFreq, freq);
        return maxFreq;
    }
}