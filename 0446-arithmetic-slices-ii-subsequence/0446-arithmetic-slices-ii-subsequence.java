class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer>[] maps=new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            maps[i]=new HashMap<>();
        }
        for(int i=1;i<maps.length;i++){
            for(int j=0;j<i;j++){
                long cd=(long)nums[i]-(long)nums[j];
                if(cd<=Integer.MIN_VALUE || cd>=Integer.MAX_VALUE){
                    continue;
                }
                int apEndingonJ=maps[j].getOrDefault((int)cd,0);
                int apEndingonI=maps[i].getOrDefault((int)cd,0);
                ans=ans+apEndingonJ;
                maps[i].put((int)cd,apEndingonJ+apEndingonI + 1);
            }
        }
        return ans;
    }
}