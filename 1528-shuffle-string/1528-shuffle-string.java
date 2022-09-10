class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        int n=s.length();
        char ch[]=new char[s.length()];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<indices.length;j++)
           {
               if(i==indices[j])
               ch[i]=s.charAt(j);    
           }
        }
        return new String(ch);
    }
}