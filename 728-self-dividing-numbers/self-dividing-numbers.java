class Solution {
    public boolean self_dividing(int num) {
        int original = num;
        while (num > 0) {
            int last = num % 10;
            if (last == 0 || original % last != 0)
                return false;
            num = num / 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (self_dividing(i))
                ans.add(i);
        }
        return ans;
    }
}