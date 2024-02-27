class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (isPrimeSetBits(i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrimeSetBits(int num) {
        int count = Integer.bitCount(num);
        return isPrime(count);
    }

    private boolean isPrime(int num) {
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

