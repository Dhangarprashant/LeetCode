class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
      String first="";
        String second="";
        for(int i=0;i<word1.length;i++){
            first=first.concat(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            second=second.concat(word2[i]);
        }
        return (first.equals(second));
    }
}

