class Solution {
    public String toLowerCase(String s) {
        StringBuilder lower = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);

            if (value <= 90 && value >= 65) {
                value += 32;
                lower.append((char) value);
            } else {
                lower.append((char) value);
            }
        }

        return lower.toString();

    }
}