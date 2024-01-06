class Solution {
    public int maxVowels(String s, int k) {
        
        int count=0;
        int ans=0;
        
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        
        ans=count;
        
        for(int i=k;i<s.length();i++){
            char aquire=s.charAt(i);
            char release=s.charAt(i-k);
            
            if(isVowel(aquire)){
                count++;
            }
            if(isVowel(release)){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
    public static boolean isVowel(char ch){
        if(ch=='a'){
            return true;
        }else if(ch=='e'){
            return true;
        }else if(ch=='i'){
            return true;
        }else if(ch=='o'){
            return true;
        }else if(ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}