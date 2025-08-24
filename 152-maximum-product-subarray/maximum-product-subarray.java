class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int maxP = nums[0];
        int minP = nums[0];

        int max = nums[0];
        int ans = nums[0];

        for(int i=1;i<n;i++){

            if(nums[i]<0){
                maxP = minP+maxP;
                minP = maxP-minP;
                maxP=maxP-minP;
            }

            maxP = Math.max(maxP*nums[i],nums[i]);
            minP = Math.min(minP*nums[i],nums[i]);

            ans = Math.max(maxP,ans);
        }
        return ans;
    }
}