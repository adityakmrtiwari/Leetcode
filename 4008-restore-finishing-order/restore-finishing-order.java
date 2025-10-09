class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];

        HashSet<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }

        int i = 0;
        for (int o : order) {
            if (set.contains(o))
                res[i++] = o;
        }
        return res;
    }
}