class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        if(n == 0) {
            return "";
        }
        if(n == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        int min_len = Math.min(strs[0].length(), strs[n - 1].length());

        int cnt = 0;
        for(int i = 0; i < min_len; i++) {
            if(strs[0].charAt(i) == strs[n - 1].charAt(i)) {
                cnt++;
            }
            else {
                break;
            }
        }

        return strs[0].substring(0, cnt);
    }
}
