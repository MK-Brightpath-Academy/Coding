class Solution {
    public int lengthOfLongestSubstring(String s) {
         
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[256];
            int length = 0;

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (seen[c]) break; // Repeated character found
                seen[c] = true;
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}