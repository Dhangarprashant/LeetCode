
public class Solution {
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        String paddedBinaryString = String.format("%32s", binaryString).replace(' ', '0');
        String reversedBinaryString = new StringBuilder(paddedBinaryString).reverse().toString();
        return (int) Long.parseLong(reversedBinaryString, 2);
    }
}
