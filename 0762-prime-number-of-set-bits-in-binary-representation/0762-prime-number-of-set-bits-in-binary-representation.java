class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            String binaryRepresentation = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binaryRepresentation.length(); j++) {
                if (binaryRepresentation.charAt(j) == '1') {
                    count++;
                }
            }
            if (isPrime(count)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
