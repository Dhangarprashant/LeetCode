class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int temp=i;
            int number=temp;
            String str="";
            while(number!=0){
                str=str+number%2;
                number=number/2;
            }
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    count++;
                }
            }
            ans[temp]=count;
        }
        return ans;
    }
}