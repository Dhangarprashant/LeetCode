// class Solution {
//     public int countOdds(int low, int high) {
//         int count=0;
//         for(int i=low;i<=high;i++){
//             if(i%2==1){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int countOdds(int low, int high) {
        if(low%2==1 && high%2==1){
            return ((high-low)+1)/2+1;
        }else if(low%2==1 && high%2==0){
             return ((high-low)+1)/2;
        }else if(low%2==0 && high%2==1){
            return ((high-low)+1)/2;
        }else if(low%2==0 && high%2==0){
             return ((high-low)+1)/2;
        }
        return ((high-low)+1)/2;
    }
}

