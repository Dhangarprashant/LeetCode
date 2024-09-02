class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // Step 1: Calculate the total sum of chalk used in one full round
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        
        // Step 2: Use modulo to reduce k within one round
        k %= sum;  // Now k is within the range of one cycle
        
        // Step 3: Iterate through students and find who will run out of chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;  // This student will replace the chalk
            }
            k -= chalk[i];  // Subtract the chalk used by the current student
        }
        
        return -1;  // This line is unreachable but required to satisfy the return type
    }
}
