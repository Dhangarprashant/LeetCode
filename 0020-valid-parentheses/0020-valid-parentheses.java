class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
                if(st.size()==0){
                    return false;
                }else{
                    char top=st.pop();
                    if(ch==')' && top!='('){
                        return false;
                    }
                }
            }else if(ch=='}'){
                if(st.size()==0){
                    return false;
                }else{
                    char top=st.pop();
                    if(ch=='}' && top!='{'){
                        return false;
                    }
                }
            }else{
                if(st.size()==0){
                    return false;
                }else{
                    char top=st.pop();
                    if(ch==']' && top!='['){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 } else {
//                     char top = stack.pop();
//                     if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
//                         return false;
//                     }
//                 }
//             }
//         }
        
//         return stack.isEmpty();
//     }
// }