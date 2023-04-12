class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}


// class Solution {
//     public int majorityElement(int[] nums) {
//         int majority=0;
//         int count=1;
//         for(int i=1;i<nums.length;i++){
//             count+=nums[i]==nums[majority]?1:-1;
//             if(count==0){
//                 majority=++i;
//                 count++;
//             }
//         }
//         return nums[majority];
//     }
// }
