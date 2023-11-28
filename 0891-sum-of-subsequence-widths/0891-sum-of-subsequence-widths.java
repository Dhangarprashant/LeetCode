class Solution {
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        long ans=0;
        long mod=1000000007;
        int n=nums.length;
        long power[]=new long[n];
        power[0]=1;
        for(int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;
        }
        for(int i=0;i<n;i++){
            ans=(ans+(nums[i]*(power[i]-power[n-i-1])))%mod;
        }
        return (int)ans;
    }
}