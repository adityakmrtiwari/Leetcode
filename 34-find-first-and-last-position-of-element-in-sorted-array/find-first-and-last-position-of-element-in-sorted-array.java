class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] arr = { -1, -1 };
        while(left<=right){
            if(nums[left]==target && arr[0]== -1)
                arr[0]=left;
            else if(arr[0]==-1)
                left++;
            if(nums[right]==target && arr[1]== -1)
                arr[1]=right;
            else if(arr[1]==-1)
                right--;

            if(arr[0]!=-1 && arr[1]!=-1)
                break;
        }
        return arr;
    }
}