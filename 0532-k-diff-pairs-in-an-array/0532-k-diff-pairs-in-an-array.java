// class Solution {
//     public int findPairs(int[] nums, int k) {
//         int n=nums.length-1;
//         int count=0;
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=1;j<n;j++){
//                 if((nums[i]-nums[j])==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result=0;
        for(int x:map.keySet()){
            if(k>0 && map.containsKey(x+k)||k==0 && map.get(x)>1){
                result++;
            }
        }
        return result;
    }
}