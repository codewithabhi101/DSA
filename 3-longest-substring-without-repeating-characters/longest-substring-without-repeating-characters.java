class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        
        int[] lastSeen = new int[128];  
        for (int i = 0; i < 128; i++) lastSeen[i] = -1;

        int start = 0;  

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);

        
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }

            
            lastSeen[c] = end;

            
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
