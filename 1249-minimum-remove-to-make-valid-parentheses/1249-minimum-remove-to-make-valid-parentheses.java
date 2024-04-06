class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        char chars[]=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                stack.push(i);
            }else if(chars[i]==')'){
                if(stack.size()==0){
                    chars[i]='.';
                }else{
                    stack.pop();
                }
            }
        }
        while(stack.size()>0){
            chars[stack.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:chars){
            if(ch!='.'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}