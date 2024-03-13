// class Solution {
//     public int pivotInteger(int n) {
//         int ans=-1;
//         for(int i=1;i<=n;i++){
//             if(pivot(i,n)==true){
//                 ans=i;
//                 break;
//             }
//         }
//         return ans;
//     }
//     public static boolean pivot(int nu,int n){
//         int sum=0;
//         for(int i=1;i<=nu;i++){
//             sum=sum+i;
//         }
//         int sum2=0;
//         for(int i=nu;i<=n;i++){
//             sum2=sum2+i;
//         }
//         if(sum==sum2){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }

class Solution {
    public int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            if (pivot(i, n)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean pivot(int nu, int n) {
        int sum1 = nu * (nu + 1) / 2;  
        int sum2 = n * (n + 1) / 2 - sum1+nu;  

        return sum1 == sum2;
    }
}
