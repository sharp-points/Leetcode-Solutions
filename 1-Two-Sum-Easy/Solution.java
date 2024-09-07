class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] {i, map.get(nums[i])};
            } else {
                map.put(complement, i);
            }
        }

        return new int[]{};
        
    }
}