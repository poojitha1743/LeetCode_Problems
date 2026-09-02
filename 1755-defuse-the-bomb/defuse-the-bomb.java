class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        // k = 0
        if (k == 0) {
            return ans;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // k > 0 → next k elements
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            }
            // k < 0 → previous k elements
            else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            ans[i] = sum;
        }

        return ans;
    }
}