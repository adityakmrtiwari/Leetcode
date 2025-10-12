class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int ind = queries[i][1];

            nums[ind] += val;
            ans[i] = evenSum(nums);
        }
        return ans;
    }

    private int evenSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                sum += num;
        }
        return sum;
    }
}