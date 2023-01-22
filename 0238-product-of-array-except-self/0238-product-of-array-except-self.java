// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int length=nums.length;
//         int[] array=new int[length];
//         int totalM=1;
//         int finalM=1;
//        for(int i=0;i<length;i++){
//            totalM=nums[i]*totalM;
//            finalM=finalM*totalM;
//            array[i]=finalM;
//        }
// //         for(int i=0;i<length;++){
            
// //         }
//         return array;
//     }
// }


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int post[]=new int[nums.length];

        //keep track of the total product on the left side of each num
        int temp=1, prod=1;
        for(int i=0;i<pre.length;i++){
            prod*=temp;
            pre[i]=prod;
            temp=nums[i];
        }

        //keep track of the total product on the right side of each num
        temp=1; prod=1;
        for(int i=post.length-1;i>=0;i--){
            prod*=temp;
            post[i]=prod;
            temp=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=pre[i]*post[i];
        }

        return nums;
    }
}