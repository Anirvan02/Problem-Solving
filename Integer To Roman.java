class Solution {
    public String intToRoman(int num) {
        String thousand[] = { "", "M", "MM", "MMM" };
        String hundred[] = { "",  "C",  "CC",  "CCC",  "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String ten[] = { "",  "X",  "XX",  "XXX",  "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String one[] = { "",  "I",  "II",  "III",  "IV", "V", "VI", "VII", "VIII", "IX" };

        String thousands = thousand[num / 1000];
        String hundreds = hundred[(num % 1000) / 100];
        String tens = ten[(num % 100) / 10];
        String ones = one[num % 10];

        return thousands + hundreds + tens + ones;
    }
}
