class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int numdigits=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit*(numdigits % 2 ==0 ? 1:-1);
            n=n/10;
            numdigits++;
        }
        return numdigits%2==0?sum*-1:sum;
    }
}