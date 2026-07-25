class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        boolean[] used = new boolean[26];
        int[] lastIdx = new int[26];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) lastIdx[s.charAt(i) - 'a'] = i;
        

        for (int i = 0; i < n; i++) {
            if (used[s.charAt(i) - 'a']) continue;
            while (result.length() > 0 && result.charAt(result.length() - 1) > s.charAt(i)
                    && lastIdx[result.charAt(result.length() - 1) - 'a'] > i) {
                used[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(s.charAt(i));
            used[s.charAt(i) - 'a'] = true;
        }
        return result.toString();
    }
}