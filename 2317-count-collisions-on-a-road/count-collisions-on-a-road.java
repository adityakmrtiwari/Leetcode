class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();

        int left = 0;
        while (left < n && directions.charAt(left) == 'L') left++;

        int right = n - 1;
        while (right >= 0 && directions.charAt(right) == 'R') right--;

        int ct = 0;
        for (int i = left; i <= right; i++) {
            if(directions.charAt(i)=='L' || directions.charAt(i)=='R') ct++;
        }
        return ct;
    }
}