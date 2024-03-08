class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans[]=new int[101];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            max=Math.max(max,ans[i]);
        }
        int result=0;
        for(int i=1;i<=100;i++){
            if(ans[i]==max){
                result+=ans[i];
            }
        }
        return result;
    }
}


