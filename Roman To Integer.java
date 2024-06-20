class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] ch = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] val = {1, 5, 10, 50, 100, 500, 1000};
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for(int j = 0; j < ch.length; j++) {
                if(ch[j] == c) {
                    sum = sum + val[j];
                    break;
                }
            }
        }
        return sum;
    }
}
