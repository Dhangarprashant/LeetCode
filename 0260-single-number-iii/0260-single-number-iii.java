// class Solution {
//     public int[] singleNumber(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         int ans[]=new int[2];
//         int p=0;
//         for(Map.Entry<Integer,Integer> entry:map.entrySet){
//             if(entry.getValue()==1){
//                 ans[p]=getKey();
//                 p++;
//             }else{
//                 break;
//             }
//         }
//         retrun ans;
//     }
// }

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 
        int[] ans = new int[2];
        int p = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans[p] = entry.getKey();
                p++;
            }
        }
        
        return ans;
    }
}
