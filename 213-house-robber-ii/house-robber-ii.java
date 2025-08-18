class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        if (n == 1)
            return nums[0];

        
        return Math.max(answer(nums,0,n-2),answer(nums,1,n-1));
    }

    public int answer(int [] nums,int st , int end){

        int n = end-st+1;

        if (n == 0)
            return 0;

        if (n == 1)
            return nums[st];


        int[] dp = new int[n];

        dp[0] = nums[st];
        dp[1] = Math.max(nums[st], nums[st+1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[st+i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
}