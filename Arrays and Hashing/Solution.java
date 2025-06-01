class Solution {
    public int[] getConcatenation(int[] nums) {
        // Get the length of the original array
        int length = nums.length;

        // Create a new array with double the size
        int[] ans = new int[2 * length];

        // Fill the new array such that:
        // First half is the original array
        // Second half is also the original array
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];            // Copy original array to first half
            ans[i + length] = nums[i];   // Copy original array to second half
        }

        // Return the concatenated result
        return ans;
    }
}

/*
Time Complexity: O(n)
- We iterate over the array once.

Space Complexity: O(2n)
- We create a new array of double the input size.
*/
