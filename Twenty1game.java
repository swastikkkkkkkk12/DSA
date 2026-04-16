
class Twenty1game {

    public static double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) {
            return 1.0;
        }

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double windowSum = 1.0;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) {
                windowSum += dp[i];
            } else {
                result += dp[i];
            }

            if (i - maxPts >= 0) {
                windowSum -= dp[i - maxPts];
            }
        }

        return result;
    }
// recall this.
    public static void main(String[] args) {
        int n = 21;
        int k = 17;
        int maxPts = 10;

        double answer = new21Game(n, k, maxPts);
        System.out.println(answer);
    }
}
