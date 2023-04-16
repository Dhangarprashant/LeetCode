// class Solution {
//     public List<Integer> findLonely(int[] nums) {
//         List<Integer> list=new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=1;i<nums.length;){
//             if(nums[i-1]!=nums[i] && (nums[i]-1)<=nums[i] && nums[i]>=(nums[i]+1)){
//                 i++;
//             }else{
//                 list.add(nums[i]);
//             }
//         }
//         return list;
//     }
// }

class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:nums){
            if(map.get(i)==1 && !map.containsKey(i-1) && !map.containsKey(i+1)){
                list.add(i);
            } 
        }
        return list;
    }
}
// class Solution {
//     public List<Integer> findLonely(int[] arr) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
//         for (int i : arr) if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) list.add(i);
//         return list;
//     }
// }



