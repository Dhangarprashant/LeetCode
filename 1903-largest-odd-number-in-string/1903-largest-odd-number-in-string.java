class Solution {
    public String largestOddNumber(String num){
        if(num.charAt(num.length()-1)%2==1) 
            return num;
        int i=num.length()-1; 
        while(i>=0){
            if(num.charAt(i)%2==1) break;
            i--;
        }
        return num.substring(0,i+1);
    }
}
