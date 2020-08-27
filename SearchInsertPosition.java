/**
 * 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * Input: [1,3,5,6], 5
 * Output: 2
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            if (target > nums[i]) ans = i + 1;
        }
        return ans;
    }
}