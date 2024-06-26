import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            str.append(digits[i]);
        }

        BigInteger num = new BigInteger(str.toString());

        num = num.add(BigInteger.ONE);

        String resStr = num.toString();

        int[] res = new int[resStr.length()];
        for (int i = 0; i < resStr.length(); i++) {
            res[i] = resStr.charAt(i) - '0';
        }
        
        return res;
    }
}
