class Solution {
    public boolean detectCapitalUse(String word) {

        char first = word.charAt(0);
        boolean firstCapitalized = false;
        boolean allCapitals = false;
        
        if (first < 97) {
            firstCapitalized = true;
            allCapitals = true;
        }
        
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 97 && allCapitals != true) {
                return false;
            } else if (word.charAt(i) < 97 && firstCapitalized != true) {
                return false;
            } else if (word.charAt(i) >= 97) {
                
                if (i > 1 && allCapitals == true) {
                    return false;
                }
                
                allCapitals = false;
            }
        }

        return true;
        
    }
}