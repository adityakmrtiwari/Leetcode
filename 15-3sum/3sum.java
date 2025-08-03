class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int x = -nums[i];
            int st = i+1;
            int end = nums.length - 1;
            while (st < end) {
                if (nums[st] + nums[end] == x) {
                    ans.add(Arrays.asList(nums[i],nums[st], nums[end]));
                    st++;
                    end--;
                     while (st < end && nums[st] == nums[st - 1]) st++;
                    while (st < end && nums[end] == nums[end + 1]) end--;
                } else if (nums[st] + nums[end] > x)
                    end--;
                else if (nums[st] + nums[end] < x)
                    st++;
            }
        }
        return ans;
    }
}