class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] array=new String[str.length];
        for(String t:str){
            int n=t.length();
            int pos=t.charAt(n-1)-48;
            array[pos-1]=t.substring(0,n-1);
        }
        StringBuilder pra=new StringBuilder();
        for(String t:array){
            pra.append(t);
            pra.append(" ");
        }
        return pra.toString().trim();
    }
}