import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: sort array
        int closestSum = nums[0] + nums[1] + nums[2]; // initial guess

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Step 2: check if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Step 3: move pointers
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // exact match found
                    return sum;
                }
            }
        }

        return closestSum;
    }
}
