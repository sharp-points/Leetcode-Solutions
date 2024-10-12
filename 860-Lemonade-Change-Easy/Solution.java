class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++;
            } else if (bills[i] == 10) {
                if (fives > 0) {
                    fives--;
                    tens++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (fives > 0 && tens > 0) {
                    tens--;
                    fives--;
                } else if (fives > 2) {
                    fives -= 3;
                } else{
                    return false;
                }
            }
        }

        return true;
        
    }
}