class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0; // Pointer for string s
        int tPointer = 0; // Pointer for string t

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                // If the characters match, move sPointer to the next character in s
                sPointer++;
            }
            // Move tPointer to the next character in t, regardless of the match
            tPointer++;
        }

        // If sPointer has reached the end of s, it means s is a subsequence of t
        return sPointer == s.length();
    }
}
