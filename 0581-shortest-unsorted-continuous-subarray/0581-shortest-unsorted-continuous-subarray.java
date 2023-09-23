class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int left=0;
        int right=nums.length-1;
        while(left<nums.length && nums[left]==arr[left]){
            left++;
        }
        while(right>=left && nums[right]==arr[right]){
            right--;
        }
        return right-left+1;
    }
}


// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int n = nums.length;
//         int[] sortedNums = nums.clone();
//         Arrays.sort(sortedNums);
        
//         int left = 0;
//         int right = n - 1;
        
//         while (left < n && nums[left] == sortedNums[left]) {
//             left++;
//         }
        
//         while (right >= left && nums[right] == sortedNums[right]) {
//             right--;
//         }
        
//         return right - left + 1;
//     }
// }
