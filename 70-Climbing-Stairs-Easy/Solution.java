class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int[] sol = new int[n +1];
        sol[0] = sol[1] = 1;

        for (int i = 2; i <= n; i++) {
            sol[i] = sol[i - 1] + sol[i - 2];
        }

        return sol[n];
        
        
    }
}