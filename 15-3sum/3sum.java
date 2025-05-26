class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicates

            int target = -nums[i]; // Step 2: Find two numbers that sum to -nums[i]
            int j = i + 1, k = nums.length - 1; // Two pointers

            while (j < k) {
                int sum = nums[j] + nums[k];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k])); // Triplet found

                    // Move both pointers while skipping duplicates
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;

                    j++;
                    k--;
                } else if (sum < target) {
                    j++; // Need a larger number
                } else {
                    k--; // Need a smaller number
                }
            }
        }
        return result;

    }
}