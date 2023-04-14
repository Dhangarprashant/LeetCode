// class Solution {
//     public int mostFrequentEven(int[] nums) {
//         Arrays.sort(nums);
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         int max=-1;
//         int ans=-1;
//         for(int i:map.keySet()){
//             if(i%2==0){
//                  ans=Math.max(max,map.get(i));
//                 return ans;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans[]=new int[100001];
        for(int x:nums){
            ans[x]++;
        }
        int maxcount=0;
        int res=-1;
        for(int i=0;i<ans.length;i++){
            if(i%2==0 && ans[i]>maxcount){
                maxcount=ans[i];
                res=i;
            }
        }
        return res;
    }
}

