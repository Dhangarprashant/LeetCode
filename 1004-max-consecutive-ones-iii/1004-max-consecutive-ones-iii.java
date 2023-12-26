class Solution {
    public int longestOnes(int[] nums, int k) {
        // Pep coding
        int ans=0;
        int i=0;
        int j=-1;
        int coziw=0; // count of zero in a window
        while(i<nums.length){
            // Acquire
            if(nums[i]==0){
                i++;
                coziw++;
            }else{
                i++;
            }
            //if not valid , release till again bevame valid
            while(coziw > k){
                j++;
                if(nums[j]==0){
                    coziw--;
                }else{
                    //Do nothing
                }
            }
            //consider
            int sow=i-1-j; // size of window
            ans=Math.max(ans,sow);
        }
        return ans;
    }
}