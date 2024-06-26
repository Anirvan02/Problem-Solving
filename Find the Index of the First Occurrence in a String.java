class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int res = 0, ind = 0;

        for(int i = 0; i <= haystack.length() - n; i++) {
            String s = haystack.substring(i, i + n);
            if(s.equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
