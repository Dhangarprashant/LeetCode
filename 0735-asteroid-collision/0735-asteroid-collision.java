// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         int length=asteroids.length;
//         if(length<=1){
//             return asteroids;
//         }
//         Stack<Integer> stack=new Stack<>();
//         for(int asteroid:asteroids)
//         {
//             if(asteroid>0){
//                 stack.push(asteroid);
//             }else
//             {
//                 while(!stack.isEmpty() && stack.peek()>0 && Math.abs(stack.peek()) < Math.abs(asteroid)){
//                     if(stack.isEmpty() || stack.peek()<0){
//                         stack.push(asteroid);
//                     }else if(stack.peek() == Math.abs(asteroid)){
//                         stack.pop();
//                     }
//                 }
//             }
//         }
//         int[] output=new int[stack.size()];
//             for(int i=output.length-1;i>=0;i--){
//                 output[i]=stack.pop();
//             }
//         return output;
//     }
// }


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty() || asteroids[i]>0 ){
              st.push(asteroids[i]);
            }else{
                while(true){
                    int peek = st.peek();
                    if(peek<0){
                        st.push(asteroids[i]);
                        break;
                    }else if(peek == -asteroids[i]){
                        st.pop();
                        break;
                    }else if(peek > -asteroids[i]){
                        break;
                    }else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i = st.size()-1; i>=0; i--){
            res[i] = st.pop();
        }
         return res;
        }
    }