class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Map to store the frequency of remainders
        Map<Integer, Integer> remainders = new HashMap<>();
        remainders.put(0, 1); // Initialize with 0 remainder to handle subarrays starting from index 0
        int currentSum = 0; // Variable to store the cumulative sum
        int cnt = 0; // Variable to count the number of valid subarrays

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i]; // Update the cumulative sum
            int remainder = currentSum % k;

            // Adjust the remainder to be positive
            if (remainder < 0) remainder += k;

            // If the remainder is already in the map, it means we found a valid subarray
            cnt += remainders.getOrDefault(remainder, 0);

            // Update the frequency of the current remainder
            remainders.put(remainder, remainders.getOrDefault(remainder, 0) + 1);
        }

        return cnt;
    }
}
