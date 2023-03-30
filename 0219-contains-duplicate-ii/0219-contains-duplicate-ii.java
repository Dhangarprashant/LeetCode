// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int s=nums.length;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<s;i++){         
//         }
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
