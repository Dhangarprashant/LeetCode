class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int length=nums.size();
        int ans=0;
        for(int i=0;i<length;i++){
            int temp=i;
            int n=temp;
            String a="";
            while(n!=0){
                a=a+n%2;
                n=n/2;
            }
            int count=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1'){
                    count++;
                }
            }
            if(count==k){
                ans=ans+nums.get(temp);
            }
        }
        return ans;
    }
}

