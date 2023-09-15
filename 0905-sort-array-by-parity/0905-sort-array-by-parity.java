class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        // if(nums.length<=2){
        //     return nums;
        // }
        int ans[]=new int[nums.length];
        int oddp=even;
        int evenp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[evenp]=nums[i];
                evenp++;
            }else{
                ans[oddp]=nums[i];
                oddp++;
            }
        }
        return ans;
    }
}

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int evenCount = 0;
//         int oddCount = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] % 2 == 0) {
//                 evenCount++;
//             } else {
//                 oddCount++;
//             }
//         }
//         int[] ans = new int[nums.length];
//         int evenPointer = 0;
//         int oddPointer = evenCount;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] % 2 == 0) {
//                 ans[evenPointer] = nums[i];
//                 evenPointer++;
//             } else {
//                 ans[oddPointer] = nums[i];
//                 oddPointer++;
//             }
//         }
//         return ans;
//     }
// }
