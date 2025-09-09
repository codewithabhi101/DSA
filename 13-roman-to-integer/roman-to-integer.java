class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0; // value of the previous processed symbol (from right to left)

        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = valueOf(s.charAt(i));
            if (cur < prev) {
                // subtract when a smaller symbol appears before a larger one (IV, IX, etc.)
                result -= cur;
            } else {
                result += cur;
                prev = cur;
            }
        }

        return result;
    }

    private int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
}
