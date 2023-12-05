class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        int temp=n;
        while(temp>1){
            if(temp%2==0){
                count=count+temp/2;
                temp=temp/2;
            }else{
                count+=temp/2;
                temp=temp/2+1;
            }
        }
        return count;
    }
}