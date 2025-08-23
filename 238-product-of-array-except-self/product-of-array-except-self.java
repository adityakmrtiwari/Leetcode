class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int prod = 1;
        int z = 0;

        for (int num : nums) {
            if (num == 0) {
                z++;
                continue;
            }
            prod *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(z>1){
                arr[i]=0;
            }
            else if (z > 0) {
                if (nums[i] == 0)
                    arr[i] = prod;
                else
                    arr[i] = 0;
            }
             else
                arr[i] = prod / nums[i];
        }
        return arr;
    }
}