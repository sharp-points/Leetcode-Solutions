class Solution {
    public int[] plusOne(int[] digits) {

        digits[digits.length - 1] += 1;

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int[] digitsNew = new int[digits.length + 1];
            digitsNew[0] = 1;

            for (int i = 1; i < digits.length; i++) {
                digitsNew[i] = digits[i - 1];
            }

            return digitsNew;
        } else {
            return digits;
        }        
        

    }
}