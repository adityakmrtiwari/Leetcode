class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int[] arr = new int[nums.length];
        int n = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                arr[n--] = nums[l] * nums[l];
                l++;
            } else {
                arr[n--] = nums[r] * nums[r];
                r--;
            }
        }
        return arr;
    }
}

// for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;