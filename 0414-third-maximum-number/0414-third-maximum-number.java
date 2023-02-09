class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int ans[]=new int[hs.size()];
        int k=0;
        for(int i:hs){
            ans[k]=i;
            k++;
        }
        Arrays.sort(ans);
        if(ans.length<3){
            return ans[ans.length-1];
        }else{
            return ans[ans.length-3];
        }
    }
}