class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }

        return (int)Math.floor(Math.sqrt(x));
    }
}
