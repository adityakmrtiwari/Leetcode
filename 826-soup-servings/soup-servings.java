class Solution {
    // Stores already computed probabilities for (a,b) states
    Map<String, Double> memo = new HashMap<>();

    public double soupServings(int n) {
        // For large n, probability is almost 1
        if (n > 5000) return 1.0;
        // Convert mL to units of 25 mL
        int units = (int) Math.ceil(n / 25.0);
        return dfs(units, units); // start with full A and B
    }

    private double dfs(int a, int b) {
        // Base cases
        if (a <= 0 && b <= 0) return 0.5; // both empty together
        if (a <= 0) return 1.0;           // A empties first
        if (b <= 0) return 0.0;           // B empties first

        // Check memo
        String key = a + "," + b;
        if (memo.containsKey(key)) return memo.get(key);

        // Recursive probability calculation
        double prob = 0.25 * (
            dfs(a - 4, b) +        // 100 mL A, 0 mL B
            dfs(a - 3, b - 1) +    // 75 mL A, 25 mL B
            dfs(a - 2, b - 2) +    // 50 mL A, 50 mL B
            dfs(a - 1, b - 3)      // 25 mL A, 75 mL B
        );

        // Store in memo
        memo.put(key, prob);
        return prob;
    }
}
