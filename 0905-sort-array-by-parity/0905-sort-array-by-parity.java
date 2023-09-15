// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int even=0;
//         int odd=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 even++;
//             }else{
//                 odd++;
//             }
//         }
//         if(nums.length<=2){
//             return nums;
//         }
//         int ans[]=new int[nums.length];
//         int oddp=odd;
//         int evenp=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]%2==0){
//                 ans[evenp]=nums[i];
//                 evenp++;
//             }else{
//                 ans[oddp]=nums[i];
//                 oddp++;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;

        // Count the number of even and odd elements in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create a result array of the same size as the input array
        int[] ans = new int[nums.length];

        // Initialize pointers for even and odd numbers in the result array
        int evenPointer = 0;
        int oddPointer = evenCount;

        // Fill the result array with even and odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[evenPointer] = nums[i];
                evenPointer++;
            } else {
                ans[oddPointer] = nums[i];
                oddPointer++;
            }
        }

        return ans;
    }
}
