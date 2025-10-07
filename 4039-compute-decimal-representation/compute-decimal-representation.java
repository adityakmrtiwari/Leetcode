class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int temp = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0)
                list.add(lastDigit * temp);
            n = n / 10;
            temp = temp * 10;
        }

        Collections.reverse(list);

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}