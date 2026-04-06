class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < nums.length; i++) {

            int diff = nums[i] - nums[i - 1];

            if (diff == 1) {
                currLen++;                 // extend sequence
            } 
            else if (diff == 0) {
                continue;                  // ignore duplicates
            } 
            else {
                currLen = 1;               // reset on break
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
