class Solution {
    public int minAnagramLength(String s) {
        int n = s.length();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i)
                    divisors.add(n / i);
            }
        }

        Collections.sort(divisors);

        for (int L : divisors) {
            if (check(s, L))
                return L;
        }
        return n;

    }

    private boolean check(String s, int L) {
        int n = s.length();
        int[] target = new int[26];
        int[] cur = new int[26];

        for (int i = 0; i < L; i++)
            target[s.charAt(i) - 'a']++;

        for (int i = 0; i < n; i++) {
            cur[s.charAt(i) - 'a']++;
            if (i % L == L - 1) {
                if (!Arrays.equals(cur, target))
                    return false;
                Arrays.fill(cur, 0);
            }
        }
        return true;
    }

}