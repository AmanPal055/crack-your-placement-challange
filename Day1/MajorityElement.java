class Solution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .sorted()
            .toList().get(nums.length / 2);
    }
}
