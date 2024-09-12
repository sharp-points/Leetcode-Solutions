class Solution {
    public int removeDuplicates(int[] nums) {

        int curIndex = 0;
        int current = nums[curIndex];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > current) {
                curIndex += 1;
                nums[curIndex] = nums[i];
                current = nums[i];
                count += 1;
            }
        }
        return count;
    }
}