/*
7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1: Input: 123 / Output: 321
Example 2: Input: -123 / Output: -321
Example 3: Input: 120 / Output: 21
Example 4: Input: -2147483412 / Output: -2143847412

Note:
Assume we are dealing with an environment which could only store integers 
within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, 
assume that your function returns 0 when the reversed integer overflows.
*/

public class reverseInt {    
    public int reverse(int x) {
        int output = 0;
        while (x!=0){
            int pop = x % 10;
            x = x / 10;
            if (output > Integer.MAX_VALUE / 10 || (output == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (output < Integer.MIN_VALUE / 10 || (output == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            output = output * 10 + pop;
        }
        return output;
    }
}