class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> str = new ArrayList<>();
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            for (int j = 0; j < str.size(); j++) {
                if (str.get(j) == ch) {
                    str.subList(0, j + 1).clear();
                    break;
                }
            }
            str.add(ch);

            maxLen = Math.max(maxLen, str.size());
        }

        return maxLen;
    }
}
