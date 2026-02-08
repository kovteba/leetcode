class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean add = set.add(nums[i]);
            if (!add) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return set.size();
    }
}