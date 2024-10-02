class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        sumLeft[nums.length - 1] = 0;
        sumRight[0] = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            sumLeft[i] = sumLeft[i + 1] + nums[i + 1];
        }

        if (sumRight[0] == sumLeft[0]) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {         
            sumRight[i] = sumRight[i - 1] + nums[i - 1];

            if (sumRight[i] == sumLeft[i]) {
                return i;
            }
        }

        return -1;
    }
}