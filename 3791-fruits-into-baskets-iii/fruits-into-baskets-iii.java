class Solution {
    int n;         // Number of baskets (also fruits length)
    int[] seg;     // Segment tree array to store maximum values in each segment

    // Update function: After updating child nodes, update the current node with max of children
    void Update(int p) { 
        seg[p] = Math.max(seg[p << 1], seg[p << 1 | 1]); 
    }

    // Build the segment tree based on initial basket capacities
    void Build(int p, int l, int r, int[] baskets) {
        if (l == r) { // Leaf node → single basket
            seg[p] = baskets[l];
            return;
        }
        int mid = (l + r) >> 1; // Split into two halves
        Build(p << 1, l, mid, baskets);           // Build left child
        Build(p << 1 | 1, mid + 1, r, baskets);   // Build right child
        Update(p); // Update current node with max value from children
    }

    // Assign a value to a specific index in the segment tree (update basket capacity)
    void Assign(int x, int v, int p, int l, int r) {
        if (x < l || x > r) { // Index x is outside current segment
            return;
        }
        if (l == r) { // Leaf node → update the basket value
            seg[p] = v;
            return;
        }
        int mid = (l + r) >> 1;
        Assign(x, v, p << 1, l, mid);           // Update in left child
        Assign(x, v, p << 1 | 1, mid + 1, r);   // Update in right child
        Update(p); // Update current node after changes
    }

    // Find the first position where basket capacity >= value v
    int FirstLarger(int v, int p, int l, int r) {
        if (seg[p] < v) { // If the max in this segment is smaller than v, skip it
            return r + 1; // Return an invalid index (out of range)
        }
        if (l == r) { // Leaf node → this is the position
            return r;
        }
        int mid = (l + r) >> 1;
        
        // Check left subtree first
        int lf = FirstLarger(v, p << 1, l, mid);
        if (lf <= mid) { // Found valid position in left subtree
            return lf;
        }
        // Otherwise, check right subtree
        return FirstLarger(v, p << 1 | 1, mid + 1, r);
    }

    // Main function to calculate number of unplaced fruits
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        n = fruits.length;
        seg = new int[4 * n + 1]; // Segment tree size = 4*n for safe allocation
        
        // Build segment tree with basket capacities
        Build(1, 0, n - 1, baskets);

        int res = 0; // Count of fruits that cannot be placed
        for (int x : fruits) {
            // Find first basket where capacity >= fruit size
            int pos = FirstLarger(x, 1, 0, n - 1);
            if (pos == n) {
                // No basket found → fruit remains unplaced
                res++;
            } else {
                // Place fruit in basket and set basket capacity to 0 (occupied)
                Assign(pos, 0, 1, 0, n - 1);
            }
        }
        return res;
    }
}
