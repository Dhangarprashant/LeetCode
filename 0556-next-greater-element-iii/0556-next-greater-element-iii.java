class Solution {
    public int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i == -1) {
            return -1;
        }
        int k = arr.length - 1;
        while (arr[i] >= arr[k]) {
            k--;
        }
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;

        String res = "";
        for (int j = 0; j <= i; j++) {
            res = res + arr[j];
        }
        for (int j = arr.length - 1; j > i; j--) {
            res = res + arr[j];
        }
        long ans = Long.parseLong(res); // Use long to check if it exceeds 32-bit integer range
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ans; // Cast to int for the final result
    }
}
