class Solution 
{
    public int addMinimum(String word) 
    {
        int length=word.length();
        int count=0;
        for(int i=0;i<length;){
            if(word.charAt(i)=='a'){
                i++;
            }else{
                count++;
            }
             if(i<length && word.charAt(i)=='b'){
                i++;
            }else{
                count++;
            }
             if(i<length && word.charAt(i)=='c'){
                i++;
            }else{
                count++;
            }
        }
        return count;
    }
}
