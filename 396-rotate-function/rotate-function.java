class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;   // total sum of array
        long f = 0;     // F(0)

        // Step 1: compute sum and F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long max = f;

        // Step 2: compute F(k) using recurrence
        for (int k = 1; k < n; k++) {
            f = f + sum - (long) n * nums[n - k];
            max = Math.max(max, f);
        }

        return (int) max;
    }
}



// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int sum;
//         for (int i = 0; i < nums.length; i++) {
//             sum = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 sum += j * nums[j];
//             }
//             max = Math.max(max, sum);
//             rota(nums);
//         }
//         return max;
//     }

//     public void rota(int[] nums) {
//         int temp = nums[nums.length - 1];
//         for (int i = nums.length - 1; i > 0; i--) {
//             nums[i] = nums[i - 1];
//         }
//         nums[0] = temp;
//     }
// }