import java.util.Arrays;

class ClimbStairs {

    // Solving using Memoization
    public static int ClimbStairsUsingMemoization(int n, int[] qb) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (qb[n] > 0) {
            return qb[n];
        }
        int nm1 = ClimbStairsUsingMemoization(n - 1, qb);
        int nm2 = ClimbStairsUsingMemoization(n - 2, qb);
        int nm3 = ClimbStairsUsingMemoization(n - 3, qb);
        int cp = nm1 + nm2 + nm3;
        qb[n] = cp;
        return cp;
    }

    // Solving using tabulation
    public static int ClimbStairsUsingTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int resMemo = ClimbStairsUsingMemoization(n, new int[n + 1]);
        System.out.println("Memoization");
        System.out.println(resMemo);

        int resTabu = ClimbStairsUsingTabulation(n);
        System.out.println("Tabulation");
        System.out.println(resTabu);
    }
}