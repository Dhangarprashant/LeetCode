class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
       String m="";
        String n="";
        for(int i=0;i<word1.length;i++){
           m=m.concat(word1[i]);
        }
        for(int j=0;j<word2.length;j++){
            n=n.concat(word2[j]);
        }
        
    return (m.equals(n));
    }
}