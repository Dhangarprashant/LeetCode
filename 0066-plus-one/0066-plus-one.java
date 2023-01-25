// class Solution {
//     public int[] plusOne(int[] digits) {
//         int length=digits.length;
//         if(length==1){
//             int pr[]=new int[length+1];
//             digits[0]=1;
//           //  digits[1]=0;
//             return pr;
//         }
//         for(int i=length-1;i>=0;i--){
//             if(digits[i]!=9){
//                 digits[i]++;
//                 break;
//             }else{
//                 digits[i]=0;
//             }
//         }
//         if(digits[0]==0){
//             int[] res=new int[length+1];
//             digits[0]=1;
//             return res;
//         }
//         return digits;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits)
    {
        int n = digits.length;
        for(int i = n-1;i>=0;i--)
        {
            if(digits[i] !=9)
            {
                digits[i]++;
                break;
            }
            else
            {
                digits[i]=0;
            }
            
        }
        if(digits[0]==0)
        {
            int []res = new int [n+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}