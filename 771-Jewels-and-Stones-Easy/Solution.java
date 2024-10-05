class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> jList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jList.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jList.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;      
    }
}