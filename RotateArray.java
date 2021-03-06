/**
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Follow up:
 * 
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] =  temp;
            }
        }
    }
}