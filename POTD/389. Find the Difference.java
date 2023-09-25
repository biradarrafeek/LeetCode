class Solution {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26]; // Create an array to store character counts
        
        // Iterate through string s and increment the count for each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Iterate through string t and decrement the count for each character
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }
        // Find the character with a count of -1, which is the extra character
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == -1) {
                return (char) (i + 'a');
            }
        }
        return ' '; // This should not happen if the input is valid
    }
}
