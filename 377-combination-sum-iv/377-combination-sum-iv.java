class Solution {
    private int[] dp;
    
    public int combinations(int[] nums, int target) {
        if (dp[target] != -1) return dp[target];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) res += combinations(nums, target - nums[i]);
        }
        dp[target] = res;
        return res;
    }
    
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return combinations(nums, target);
    }
}