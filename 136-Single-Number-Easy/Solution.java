class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> listed = new HashMap<Integer, Boolean>();

        int returnVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!listed.containsKey(nums[i])) {
                listed.put(nums[i], false);
            } else {
                listed.replace(nums[i], false, true);
            }
        }

        for (Integer key : listed.keySet()) {
            if (listed.get(key) == false) {
                return key;
            }
        }

        return -1;
        
    }
}
