class Solution {
    public int addDigits(int num) {
        
        int floor = (num - 1) / 9;
        int dr = num - (9 * floor);

        return dr;
    }
}