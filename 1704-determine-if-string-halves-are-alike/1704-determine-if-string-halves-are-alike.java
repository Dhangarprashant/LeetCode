class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        String a=s.substring(0,l/2);
        String b=s.substring(l/2);
        
        int countVinA=isVowel(a);
        int countVinB=isVowel(b);
        
        return countVinA == countVinB;
    }
    public static int isVowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' ){
                count++;
            }
        }
        return count;
    }
}