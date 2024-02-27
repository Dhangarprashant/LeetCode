class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        for(int i=left;i<=right;i++){
            String ans=Integer.toBinaryString(i);
            int count=0;
            for(int j=0;j<ans.length();j++){
                if(ans.charAt(j)=='1'){
                    count++;
                }
            }
            if(isprime(count)){
                    result++;
            }
        }
        return result;
    }
 public static boolean isprime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}