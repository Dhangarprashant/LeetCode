

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(i<=j && map.get(nums[j]) > k){
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
