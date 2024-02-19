class Solution {
    public boolean hasAlternatingBits(int n) {
       // Use XOR to check if adjacent bits are different
        int xorResult = n ^ (n >> 1);

        // Check if all bits in xorResult are set to 1
        return (xorResult & (xorResult + 1)) == 0;
    }
}