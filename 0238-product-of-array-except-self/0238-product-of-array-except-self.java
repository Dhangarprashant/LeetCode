// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int pro=1;
//         for(int i=0;i<nums.length;i++){
//             pro=pro*nums[i];
//         }
//         int result[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 result[i]=pro/nums[i];
//             }else{
//                 result[i]=pro;
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp=1;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*temp;
            temp=temp*nums[i];
        }
        return result;
    }
}