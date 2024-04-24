class Solution {
    
    private int gcd(int a, int b){
      if (b == 0){
        return a;  
      }
      return gcd(b, a % b);
    }
    
    
    public int minOperations(int[] nums) {
        int n = nums.length;
        int oneCt = 0;
        for(int i=0;i<n;i++){
            oneCt += (nums[i]==1?1:0);
        }
        if(oneCt>0){
            return n-oneCt;
        }
        int currLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int currGcd = 0;
            for(int j=i;j<n;j++){
                currGcd = gcd(currGcd, nums[j]);
                if(currGcd ==1){
                    currLen = Math.min(currLen, (j-i) + n-1);
                    break;
                }
            }
        }
        currLen = currLen==Integer.MAX_VALUE?-1: currLen;
        return currLen;
        
    }
}