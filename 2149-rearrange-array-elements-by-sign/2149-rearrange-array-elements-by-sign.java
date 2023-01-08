// class Solution 
// {
//     public int[] rearrangeArray(int[] nums) 
//     {
//         int n=nums.length;
//         int[] ans=new int[n];
//         int pi=0;
//         int ni=1;
//         for(int i:nums){
//             if(i>=0){
//                 ans[pi]=i;
//                 pi+=2;
//             }else{
//                 ans[ni]=i;
//                 ni+=2;
//             }
//         }
//         return ans;
//     }
// }

class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int length=nums.length;
        int a[]=new int[length];
        int index=0;
        for(int i=0;i<length;i++){
            if(nums[i]>0){
                a[index]=nums[i];
                index=index+2;
            }
        }
         index=1;
        for(int i=0;i<length;i++){
            if(nums[i]<0){
                a[index]=nums[i];
                    index=index+2;
            }
        }
        return a;
    }
}