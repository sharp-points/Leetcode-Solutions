class Solution {
    public int lengthOfLastWord(String s) {
        Integer len = s.length() - 1;
        Integer count = 0;
        Boolean charPassed = false;

        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count != 0 && charPassed == true) {
                return count;
            } else if (s.charAt(i) != ' ') {
                charPassed = true;
                count++;
            }
        }

        return count;
    }
}