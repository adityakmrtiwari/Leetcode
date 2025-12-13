class Solution {
    private boolean checkValidCode(String code) {
        if (code == null || code.isEmpty()) {
            return false;
        }

        for (char ch : code.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> map = new HashMap<>();
        map.put("electronics", 0);
        map.put("grocery", 1);
        map.put("pharmacy", 2);
        map.put("restaurant", 3);

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && map.containsKey(businessLine[i]) && checkValidCode(code[i])) {
                list.add(new String[] {
                        String.valueOf(map.get(businessLine[i])), code[i]
                });
            }
        }

        Collections.sort(list, (a, b) -> {
            int orderCompare = Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            if (orderCompare != 0)
                return orderCompare;
            return a[1].compareTo(b[1]);
        });
        List<String> result = new ArrayList<>();
        for (String[] arr : list) {
            result.add(arr[1]);
        }

        return result;
    }
}