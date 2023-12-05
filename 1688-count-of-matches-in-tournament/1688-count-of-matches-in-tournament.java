// class Solution {
//     public int numberOfMatches(int n) {
//         int count=0;
//         int temp=n;
//         while(temp!=0){
//             if(temp%2==0){
//                 count=temp/2;
//                 temp=temp/2;
//             }else{
//                 count=temp/2;
//                 temp=temp/2+1;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            // Update count with the number of matches in the current round
            count += n / 2;
            
            // Calculate the number of teams for the next round
            n = (n + 1) / 2;
        }
        return count;
    }
}
