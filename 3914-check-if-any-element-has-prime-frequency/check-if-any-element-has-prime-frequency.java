class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            if (isPrime(val))
                return true;
        }
        return false;
    }

    private boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}