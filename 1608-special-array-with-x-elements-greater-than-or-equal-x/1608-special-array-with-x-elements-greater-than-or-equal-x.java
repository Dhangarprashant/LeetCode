// class Solution {
//     public int specialArray(int[] nums) {
//         int ans=-1;
//         for(int i=0;i<nums.length;i++){
//             if(satisfy(nums,nums[i])==true){
//                 ans=i;
//             }
//         }
//         return ans;
//     }
//     public static boolean satisfy(int nums[],int val){
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>=val){
//                 count++;
//             }
//         }
//         if(count>=i){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }



class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if (count == x) {
                return x;
            }
        }
        return -1;
    }
}
