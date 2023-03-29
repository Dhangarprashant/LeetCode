// class Solution {
//     public int sumOfUnique(int[] nums) {
//         int n=nums.length-1;
//         Arrays.sort(nums);
//         int sum=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==nums[i+1]){
//                 i=i+1;
//             }else{
//                 sum=sum+nums[i];
//             }
//         }
//         return sum;
//     }
// }

// class Solution {
//     public int sumOfUnique(int[] nums) {
//         int n=nums.length;
//         Arrays.sort(nums);
//         int total=0;
//         for(int i=0;i<n-1;i++){
//             if(nums[i]==nums[i+1]){
//                 total++;
//             }
//             total=total*nums[i];
//         }
//         int sum=0;
//         for(int i=0;i<n-1;i++){
//             sum=sum+nums[i];
//         }
//         return sum-total;
//     }
// }

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()==1){
                count=count+(x.getKey());
            }
        }
        return count;
    }
}