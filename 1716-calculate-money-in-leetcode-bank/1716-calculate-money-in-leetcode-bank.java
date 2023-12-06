// class Solution {
//     public int totalMoney(int n) {
//         int times=n/7;
//         int rem=n%7;
//         int count=0;
//         for(int i=1;i<=times;i++){
//             count=count+28+7*(i-1);
//         }
//         for(int j=1;j<=rem;j++){
//             count=count+j+times;
//         }
//         return count;
//     }
// }



class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainingDays = n % 7;
        int count = 0;

        // Calculate the total for complete weeks
        for (int i = 1; i <= weeks; i++) {
            count += 28 + 7 * (i - 1);  // 28 is the sum of money for a complete week
        }

        // Calculate the total for the remaining days
        for (int j = 1; j <= remainingDays; j++) {
            count += (weeks + j);  // Add the money for each remaining day
        }

        return count;
    }
}
