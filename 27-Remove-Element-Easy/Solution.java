class Solution {
    public int removeElement(int[] nums, int val) {

        int index = 0;
        int end = nums.length - 1;
        int temp = 0;
        int count = 0;

        while (index <= end) {
            
            if (nums[index] == val) {
                if (nums[end] != val) {
                    temp = nums[end];
                    nums[end] = nums[index];
                    nums[index] = temp;
                    index += 1;
                    end -= 1;
                    count += 1;
                } else if (nums[end] == val) {
                    end -= 1;
                }
            } else {
                count += 1;
                index += 1;
            }
        }
         return count;
    }
}