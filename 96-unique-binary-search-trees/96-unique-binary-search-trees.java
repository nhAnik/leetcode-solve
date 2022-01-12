class Solution {
    public int numTrees(int n) {
        // Recursive solution (TLE)
        // if (n == 1 || n== 0) return 1;
        // int num = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     num += (numTrees(i) * numTrees(n - 1 - i));
        // }
        // return num;
        // Move to iterative dp
        
        int[] dp = new int[20];
        int sum;
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                sum += (dp[j] * dp[i - 1 - j]);
            }
            dp[i] = sum;
        }
        return dp[n];
    }
}