class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], i);
        }
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hmap.containsKey(temp) && hmap.get(temp) != i) {
                indices[0] = i;
                indices[1] = hmap.get(temp);
                return indices;
            }
        }

        return indices;

    }
}