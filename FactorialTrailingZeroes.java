/**
 * 172. Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Example 1:
 * 
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 */


public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        int temp = n;
        while(temp!=0) {
            int val = temp/5;
            count = count + val;
            if(val >= 5) temp = val;
            else temp = 0;
        }
        return count;
    }
}