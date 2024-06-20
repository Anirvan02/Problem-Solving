class Solution {
    public boolean isPalindrome(int x) {
        int pal = 0, temp = x;

        while(temp > 0) {
            int digit = temp % 10;
            pal = (pal * 10) + digit;
            temp = temp / 10;
        }

        if(pal == x) {
            return true;
        }
        else {
            return false;
        }
    }
}
