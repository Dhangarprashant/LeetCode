class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(helper(i)==true){
                count++;
            }
        }
        return count;
    }
    public static boolean helper(int num){
        String s=String.valueOf(num);
        if(s.length()%2==1){
            return false;
        }
        int div=s.length()/2;
        int first=0;
        int second=0;
        for(int i=0;i<div;i++){
            first+=(int)s.charAt(i);
        }
        for(int i=div;i<s.length();i++){
            second+=(int)s.charAt(i);
        }
        if(first==second){
            return true;
        }else{
            return false;
        }
    }
}
