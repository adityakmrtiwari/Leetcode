class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> set = new HashSet<>();

        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < n; k++) {
                    if (j == k || i == k)
                        continue;
                    num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if ((num > 99 && num < 1000) && (num % 2 == 0))
                        set.add(num);
                }
            }
        }
        int[] array = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(array);
        return array;
    }
}