class Solution {
    public boolean isPalindrome(int x) {

        boolean pal = false;

        if (x < 0 || x % 10 == 0) {
            if (x == 0) {
                return true;
            } else {
                return false;
            }
        }

        if (x >= 0 && x <= 9) {
            return true;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;

            if (x == reversed || x == reversed * 10 + x % 10) {
                pal = true;
            }
        }

        return pal;
        
    }
}