class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                sb.append((char)(s.charAt(i) + 32));
            } else if (s.charAt(i) > 96 && s.charAt(i) < 123) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
        
    }
}