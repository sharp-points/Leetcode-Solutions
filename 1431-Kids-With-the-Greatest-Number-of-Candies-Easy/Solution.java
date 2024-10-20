class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        ArrayList<Boolean> list = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= greatest);
        }

        return list;
        
    }
}