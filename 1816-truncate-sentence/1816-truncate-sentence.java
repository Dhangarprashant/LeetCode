class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder pr=new StringBuilder();
        int count=0;
        for(char c:s.toCharArray()){
            if(c==' ')
                count++;
            if(count==k)
                break;
            pr.append(c);
        }
        return pr.toString();
    }
}


