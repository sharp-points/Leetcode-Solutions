class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            first.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            second.append(word2[i]);
        }

        return first.toString().equals(second.toString());
        
    }
}