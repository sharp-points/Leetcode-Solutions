class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        HashMap<Character, Integer> romanNums = new HashMap<Character, Integer>();
        int previous = 0;
        int current = 0;
        int total = 0;

        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        for (int i = s.length() - 1; i >=0; i--) {
            char check = s.charAt(i);
            current = romanNums.get(check);
            if (current < previous) {
                total -= current;
            } else {
                total += current;
            }
            previous = current;
        }

        return total;
        
    }
}